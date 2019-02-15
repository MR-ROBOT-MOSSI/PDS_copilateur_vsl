parser grammar VSLParser;

options {
  language = Java;
  tokenVocab = VSLLexer;
}

@header {
  package TP2;

  import java.util.stream.Collectors;
  import java.util.Arrays;
}


// TODO : other rules

program returns [ASD.Program out]
    : e=expression EOF { $out = new ASD.Program($e.out); } // TODO : change when you extend the language
    | e2=expression2 EOF { $out = new ASD.Program($e2.out); }
    | e3=expressionTimes EOF { $out = new ASD.Program($e3.out); }
    | e4=expressionDiv EOF { $out = new ASD.Program($e4.out); }
       ;

expression returns [ASD.Expression out]
    : l=factor PLUS r=expression  { $out = new ASD.AddExpression($l.out, $r.out); }
    | f=factor { $out = $f.out; }
    // TODO : that's all?
    ;

expression2 returns [ASD.Expression out]
    : l=factor MINUS r=expression  { $out = new ASD.MinExpression($l.out, $r.out); }
    | f=factor { $out = $f.out; }
    // TODO : that's all?
    ;

expressionTimes returns [ASD.Expression out]
    : l=factor TIMES r=expression  { $out = new ASD.MulExpression($l.out, $r.out); }
    | f=factor { $out = $f.out; }
    // TODO : that's all?
    ;

expressionDiv returns [ASD.Expression out]
    : l=factor DIV r=expression  { $out = new ASD.DivExpression($l.out, $r.out); }
    | f=factor { $out = $f.out; }
    // TODO : that's all?
    ;
    
factor returns [ASD.Expression out]
    : p=primary { $out = $p.out; }
    // TODO : that's all?
    ;

primary returns [ASD.Expression out]
    : INTEGER { $out = new ASD.IntegerExpression($INTEGER.int); }
    // TODO : that's all?
    ;
