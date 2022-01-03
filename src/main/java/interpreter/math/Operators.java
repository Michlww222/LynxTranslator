package interpreter.math;

// TODO add all operators for enum
public enum Operators {
    MINUS, LOG, MULTIPLY, PLUS, LN, MINUS_SINGLE,DIVIDE,
    ABS,ARCTAN,COS,INT,RAND,ROUND,SIN,SQRT,TAN,NOT,POW,
    QUOT,REMAINDER,COMP,EXP,OR,AND,DIFFERENCE;


    public int howManyArgumentsTakes() {
        return switch(this) {
            case LN, MINUS_SINGLE,ABS,ARCTAN,COS,INT,RAND,ROUND,SIN,SQRT,TAN,NOT,EXP -> 1;
            case MULTIPLY,PLUS,MINUS,LOG,DIVIDE,DIFFERENCE,QUOT,AND,OR,COMP,REMAINDER,POW  -> 2;
        };
    }

    public boolean isRightCumulate() {
        return true;
    }

    public int getPriority() {
        return switch(this) {
            case COMP -> 0;
            case AND,OR -> 1;
            case MINUS,DIFFERENCE, MINUS_SINGLE,NOT  -> 2;
            case  PLUS ,REMAINDER  -> 5;
            case  DIVIDE -> 6;
            case  MULTIPLY,QUOT -> 7;
            case  POW,EXP-> 8;
            case  LOG-> 9;
            case  LN, INT, ABS, COS ,RAND, ROUND, SIN ,SQRT, TAN,ARCTAN -> 10;

        };
    }
}


