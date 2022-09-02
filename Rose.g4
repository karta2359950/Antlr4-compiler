grammar Rose;

// Parser rules
program :PROCEDURE ID IS DECLARE{System.out.println("# variables\n\t.data");}
          variables BEGIN{System.out.println("# begin function\n\t.text\nmain:");}
          statements[0, 0] END TCOL{System.out.println("# end function");};

variables : variable variables
          | ;
variable : ID COL INTEGER TCOL{System.out.println($ID.text + ":\t.word 0");};

statements [int reg, int label] returns [int nreg, int nlabel]:
      statement [$reg, $label]
      statements[$statement.nreg, $statement.nlabel]
      {$nreg = $statements.nreg; $nlabel = $statements.nlabel;}
                                                              | {$nreg = $reg; $nlabel = $label;};
statement [int reg, int label] returns [int nreg, int nlabel]:
    assignment_statement[$reg]
    {$nreg = $reg;$nlabel=$label;}
    |if_statement[$reg, $label]
    {$nreg=$if_statement.nreg;$nlabel=$if_statement.nlabel;}
    |for_statement[$reg, $label]
    {$nreg=$for_statement.nreg;$nlabel=$for_statement.nlabel;}
    |exit_statement
    {$nreg = $reg;$nlabel=$label;}
    |read_statement[$reg]
    {$nreg = $reg;$nlabel=$label;}
    |write_statement[$reg]
    {$nreg = $reg;$nlabel=$label;};


assignment_statement [int reg]:
      ID COLEQUAL arith_expression[$reg]
      TCOL
      {System.out.println("\tla\t\$t" + $arith_expression.nreg + ", " + $ID.text);}
      {System.out.println("\tsw\t\$t" + $arith_expression.nplace + ", 0(\$t" + $arith_expression.nreg +")");};

if_statement [int reg, int label] returns [int nreg, int nlabel]:
                                    IF{System.out.println("# if");}
                                    bool_expression[$reg, $label, $label+1, $label+3] THEN
                                    {System.out.println("L" + $label + ":\t# then");} //true
                                    statements[$bool_expression.nreg, $bool_expression.nlabel]
                                    {System.out.println("\tb\tL" + ($label+2));}
                                    {System.out.print("L" + ($label+1));}
                                    {System.out.println(":\t#else");} //false
                                    if_statementA[$statements.nreg, ($label+2), $statements.nlabel]
                                    {$nreg = $if_statementA.nreg; $nlabel = $if_statementA.nlabel;};

if_statementA [int reg, int nextlabel, int label] returns [int nreg, int nlabel]: 
             ELSE
             statements[$reg, $label]
             END IF TCOL
             {System.out.println("L" + $nextlabel + ":\tend if");}
             {$nreg=$statements.nreg;}
             {$nlabel=$statements.nlabel;}
             | END IF TCOL
             {System.out.println("L" + $nextlabel + ":\tend if");}
             {$nreg=$reg;}
             {$nlabel=$label;};


for_statement  [int reg, int label] returns [int nreg, int nlabel]: 
          FOR ID IN arith1=arith_expression[$reg]
          {System.out.println("\tla\t\$t" + $arith1.nreg + ", " + $ID.text);}
          {System.out.println("\tsw\t\$t" + $arith1.nplace + ", 0(\$t" + $arith1.nreg + ")");}
          {System.out.println("L" + $label + ":\t# for");}
          {System.out.println("\tla\t\$t" + $reg + ", " + $ID.text);}
          {System.out.println("\tlw\t\$t" + $reg + ", 0(\$t" + $reg + ")");}
          TPR arith2=arith_expression[$reg + 1] LOOP
          {System.out.println("\tble\t\$t" + $reg + ", \$t" + $arith2.nplace + ", L"+($label+1));}
          {System.out.println("\tb\tL" + ($label+2));}
          {System.out.println("L" + ($label+1) + ":\t# for body");}
          statements[$reg, $label +3]
          {System.out.println("\tla\t\$t" + $statements.nreg + ", " + $ID.text);}
          {System.out.println("\tlw\t\$t" + $statements.nreg + ", 0(\$t" + $statements.nreg + ")");}
          {System.out.println("\tli\t\$t" + ($statements.nreg+1) + ", 1");}
          {System.out.println("\tadd\t\$t" + $statements.nreg + ", \$t" + $statements.nreg +", \$t" + ($statements.nreg+1));}
          {System.out.println("\tla\t\$t" + ($statements.nreg+1) + ", " + $ID.text);}
          {System.out.println("\tsw\t\$t" + $statements.nreg + ", 0(\$t" + ($statements.nreg+1) + ")");}
          {System.out.println("\tb\tL" + ($label));}
          END LOOP TCOL
          {System.out.println("L" + ($label+2) + ":\t# end for");}
          {$nreg= $statements.nreg;}
          {$nlabel= $statements.nlabel;};

exit_statement : EXIT TCOL{System.out.println("\tli\t\$v0, 10\n\tsyscall");};

read_statement [int reg]: 
                   READ ID TCOL
                   {System.out.println("\tli\t\$v0, 5\n\tsyscall\n\tla\t\$t" + $reg + "," + $ID.text + "\n\tsw\t\$v0, 0(\$t" + $reg + ")");};

write_statement [int reg]: WRITE arith_expression[$reg] TCOL{System.out.println("\tmove\t\$a0, \$t" + $arith_expression.nplace + "\n\tli\t\$v0, 1\n\tsyscall");};

bool_expression [int reg, int truelabel,int falselabel, int label] returns [int nreg, int nlabel]:
      {System.out.println("L" + $label + ":");}
      bool_term[$reg, $truelabel, $falselabel, $label+1]
      bool_expressions[$bool_term.nreg, $truelabel, $falselabel, $label+1]
      {$reg=$bool_expressions.nreg;$nlabel=$bool_expressions.nlabel;};

bool_expressions [int reg, int truelabel,int falselabel, int label] returns [int nreg, int nlabel]:
      DOUBLELINE
      {System.out.println("L" + $label + ":");}
      bool_term[$reg, $truelabel, $falselabel, $label+1]
      bool_expressions[$bool_term.nreg, $truelabel, $falselabel, $label+1]
      {$reg=$bool_expressions.nreg;$nlabel=$bool_expressions.nlabel;}
      |{System.out.println("L" + $label + ":");}
      {System.out.println("\tb\tL" + $falselabel);}
      {$nreg=$reg;$nlabel = $label+1;};

bool_term [int reg, int truelabel,int falselabel, int nlabel] returns [int nreg]:
      bool_factor[$reg, $truelabel, $falselabel, $nlabel]
      bool_terms[$bool_factor.nreg, $truelabel, $falselabel, $nlabel]
      {System.out.println("\tb\tL" + $truelabel);}
      {$nreg= $bool_terms.nreg;};


bool_terms [int reg, int truelabel,int falselabel, int nlabel] returns [int nreg]:
      AND bool_factor[$reg, $truelabel, $falselabel, $nlabel] bool_terms[$bool_factor.nreg, $truelabel, $falselabel, $nlabel]{$nreg=$bool_terms.nreg;}
          | {$nreg=$reg;};


bool_factor [int reg, int truelabel, int falselabel, int nextlabel] returns [int nreg]: 
            EXCLAMATION bool_primary[$reg,$truelabel,$falselabel,$nextlabel,1]
            {$nreg=$bool_primary.nreg;}
            | bool_primary[$reg,$truelabel,$falselabel,$nextlabel,0]
            {$nreg=$bool_primary.nreg;};

bool_primary [int reg, int trueL, int falseL, int nlabel, int not] returns [int nreg]:
    arEx=arith_expression[$reg] relation_op arith_expression[$arEx.nreg]
    {
      if(not == 0)
      {
        switch($relation_op.relationCase)
        {
          case 0:
            System.out.println("\tbne\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 1:
            System.out.println("\tbge\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 2:
            System.out.println("\tble\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 3:
            System.out.println("\tbeq\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 4:
            System.out.println("\tbgt\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 5:
            System.out.println("\tblt\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
        }
      }
      else
      {
        switch($relation_op.relationCase)
        {
          case 0:
            System.out.println("\tbeq\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 1:
            System.out.println("\tblt\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 2:
            System.out.println("\tbgt\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 3:
            System.out.println("\tbne\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 4:
            System.out.println("\tble\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
          case 5:
            System.out.println("\tbge\t\$t" + $arEx.nplace + ", \$t" + $arith_expression.nplace + ", L" + $nlabel);
            break;
        }
      }
    }
    {$nreg = $reg;};

relation_op returns [int relationCase]: 
    EQ 
    {$relationCase = 0;}
    | LT relation_op_alpha
    {$relationCase = 1 + $relation_op_alpha.relationCase;}
    | GT relation_op_beta
    {$relationCase = 2 + $relation_op_beta.relationCase;};
      
relation_op_alpha returns [int relationCase]:
    GT
    {$relationCase = 2;}
    | EQ
    {$relationCase = 3;}
    |
    {$relationCase = 0;};
          
relation_op_beta returns [int relationCase]: 
    EQ
    {$relationCase = 3;}
    |
    {$relationCase = 0;};



arith_expression [int reg] returns [int nreg, int nplace]:
      arith_term[$reg]
      arith_expressions[$arith_term.nreg, $arith_term.nplace]
      {$nreg=$arith_expressions.nreg;}
      {$nplace=$arith_expressions.nplace;};

arith_expressions [int reg, int place] returns [int nreg, int nplace]:
      ADD arith_term[$reg]
      {System.out.println("\tadd\t\$t" + $place + ", \$t" + $place +", \$t" + $arith_term.nplace);}
      {$arith_term.nreg=$arith_term.nreg-1;}
      arith_expressions[$arith_term.nreg, $place]
      {$nreg = $arith_expressions.nreg;}
      {$nplace = $arith_expressions.nplace;}
      | SUBTRACT arith_term[$reg]
      {System.out.println("\tsub\t\$t" + $place + ", \$t" + $place +", \$t" + $arith_term.nplace);}
      {$arith_term.nreg=$arith_term.nreg-1;}
      arith_expressions[$arith_term.nreg, $place]
      {$nreg = $arith_expressions.nreg;}
      {$nplace = $arith_expressions.nplace;}
      | {$nreg=$reg;$nplace=place;};

arith_term [int reg] returns [int nreg, int nplace]:
      arith_factor[$reg]
      arith_terms[$arith_factor.nreg,$arith_factor.nplace]
      {$nreg = $arith_terms.nreg; $nplace=$arith_terms.nplace;};

arith_terms [int reg, int place] returns [int nreg, int nplace]:
    MULTIPLY arith_factor[$reg]
    {System.out.println("\tmul\t\$t" + $place + ", \$t" + $place +", \$t" + $arith_factor.nplace);$arith_factor.nreg=$arith_factor.nreg-1;} arith_terms[$arith_factor.nreg,$place]{$nreg = $arith_terms.nreg; $nplace = $arith_terms.nplace;}
    | DIVIDE arith_factor[$reg]
    {System.out.println("\tdiv\t\$t" + $place + ", \$t" + $place +", \$t" + $arith_factor.nplace);$arith_factor.nreg=$arith_factor.nreg-1;} arith_terms[$arith_factor.nreg,$place]{$nreg = $arith_terms.nreg; $nplace = $arith_terms.nplace;}
    | PERCENT arith_factor[$reg]
    {System.out.println("\trem\t\$t" + $place + ", \$t" + $place +", \$t" + $arith_factor.nplace);$arith_factor.nreg=$arith_factor.nreg-1;} arith_terms[$arith_factor.nreg,$place]{$nreg = $arith_terms.nreg; $nplace = $arith_terms.nplace;}
    | {$nreg=$reg; $nplace = $place;};

arith_factor [int reg] returns [int nreg, int nplace]:
      SUBTRACT arith_primary[$reg]
      {System.out.println("\tneg\t\$t" + $arith_primary.nplace +", \$t" + $arith_primary.nplace);}
      {$nreg = $arith_primary.nreg;}
      {$nplace= $arith_primary.nplace;}
      | arith_primary[$reg]
      {$nreg = $arith_primary.nreg;}
      {$nplace= $arith_primary.nplace;};

arith_primary [int reg] returns [int nreg, int nplace]:
      CONST
      {System.out.println("\tli\t\$t" + $reg + ", " + $CONST.text);}
      {$nplace=$reg;}
      {$nreg=$reg + 1;}
      | ID
      {System.out.println("\tla\t\$t" + $reg + ", " + $ID.text);}
      {System.out.println("\tlw\t\$t" + $reg + ", 0(\$" + $reg + ")");}
      {$nplace=$reg;}
      {$nreg=$reg + 1;}
      | UPPAREN arith_expression[$reg] DOWNPAREN
      {$nreg = $arith_expression.nreg;}
      {$nplace = $arith_expression.nplace;};


// Lexer rules 
ID: ('_'|[A-Z])('_'|[A-Z]|[0-9])*;
CONST: '0'+|[1-9][0-9]*;
WHITESPACE: ([ \t]+|'\r'?'\n') -> skip;
COMMENT: '//'(~[\r\n])* -> skip;

BEGIN: 'begin';
DECLARE: 'declare';
ELSE: 'else';
END: 'end';
EXIT: 'exit';
FOR: 'for';
IF: 'if';
IN: 'in';
INTEGER: 'integer';
IS: 'is';
LOOP: 'loop';
PROCEDURE: 'procedure';
READ: 'read';
THEN: 'then';
WRITE: 'write';
COL: ':';
TPR: '..';
TCOL: ';';
ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
PERCENT: '%';
EQ: '=';
GT: '>';
LT: '<';
AND: '&&';
DOUBLELINE: '||';
EXCLAMATION: '!';
COLEQUAL: ':=';
UPPAREN: '(';
DOWNPAREN: ')';








