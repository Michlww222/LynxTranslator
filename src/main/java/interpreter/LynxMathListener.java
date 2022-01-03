package interpreter;

import grammar.LynxBaseListener;
import grammar.LynxParser;
import interpreter.math.MathStatementCollector;
import interpreter.math.Operators;


public class LynxMathListener extends LynxBaseListener {
    protected final MathStatementCollector mathCollector = new MathStatementCollector();

    @Override
    public void enterMathStatement(LynxParser.MathStatementContext ctx) {
        mathCollector.startCollecting();
    }

    @Override
    public void exitMathStatement(LynxParser.MathStatementContext ctx) {
        mathCollector.endCollecting();
    }

    @Override
    public void enterMathValue(LynxParser.MathValueContext ctx) {
        mathCollector.collect(ctx.getText());
    }

    @Override
    public void enterBrakets(LynxParser.BraketsContext ctx) {
        mathCollector.collect("(");
    }

    @Override
    public void exitBrakets(LynxParser.BraketsContext ctx) {
        mathCollector.collect(")");
    }

    @Override
    public void enterAbs(LynxParser.AbsContext ctx) { mathCollector.collect(Operators.ABS.name()); }

    @Override
    public void enterArctan(LynxParser.ArctanContext ctx) { mathCollector.collect(Operators.ARCTAN.name()); }

    @Override
    public void enterCos(LynxParser.CosContext ctx) {
        mathCollector.collect(Operators.COS.name());
    }

    @Override
    public void enterInt1(LynxParser.Int1Context ctx) {
        mathCollector.collect(Operators.INT.name());
    }

    @Override
    public void enterLn(LynxParser.LnContext ctx) {
        mathCollector.collect(Operators.LN.name());
    }

    @Override
    public void enterMinusSingle(LynxParser.MinusSingleContext ctx) { mathCollector.collect(Operators.MINUS_SINGLE.name());}

    @Override
    public void enterRandom(LynxParser.RandomContext ctx) { mathCollector.collect(Operators.RAND.name()); }

    @Override
    public void enterRound(LynxParser.RoundContext ctx) {
        mathCollector.collect(Operators.ROUND.name());
    }

    @Override
    public void enterSin(LynxParser.SinContext ctx) {
        mathCollector.collect(Operators.SIN.name());
    }

    @Override
    public void enterSqrt(LynxParser.SqrtContext ctx) {
        mathCollector.collect(Operators.SQRT.name());
    }

    @Override
    public void enterTan(LynxParser.TanContext ctx) {
        mathCollector.collect(Operators.TAN.name());
    }

    @Override
    public void enterNot(LynxParser.NotContext ctx) {
        mathCollector.collect(Operators.NOT.name());
    }

    @Override
    public void enterDifference(LynxParser.DifferenceContext ctx) { mathCollector.collect(Operators.DIFFERENCE.name()); }

    @Override
    public void enterPower(LynxParser.PowerContext ctx) { mathCollector.collect(Operators.POW.name()); }

    @Override
    public void enterQuotient(LynxParser.QuotientContext ctx) {
        mathCollector.collect(Operators.QUOT.name());
    }

    @Override
    public void enterRemainder(LynxParser.RemainderContext ctx) {
        mathCollector.collect(Operators.REMAINDER.name());
    }

    @Override
    public void enterSum(LynxParser.SumContext ctx) {
        mathCollector.collect(Operators.PLUS.name());
    }

    @Override
    public void enterMinus(LynxParser.MinusContext ctx) {
        mathCollector.collect(Operators.MINUS.name());
    }

    @Override
    public void enterProduct(LynxParser.ProductContext ctx) {
        mathCollector.collect(Operators.MULTIPLY.name());
    }

    @Override
    public void enterDivision(LynxParser.DivisionContext ctx) { mathCollector.collect(Operators.DIVIDE.name()); }

    // TODO all other comparisons
    @Override
    public void enterComparison(LynxParser.ComparisonContext ctx) {
        mathCollector.collect(Operators.COMP.name());
    }

    @Override
    public void enterExp(LynxParser.ExpContext ctx) {
        mathCollector.collect(Operators.EXP.name());
    }

    @Override
    public void enterLog(LynxParser.LogContext ctx) {
        mathCollector.collect(Operators.LOG.name());
    }

    @Override
    public void enterOr(LynxParser.OrContext ctx) {
        mathCollector.collect(Operators.OR.name());
    }

    @Override
    public void enterAnd(LynxParser.AndContext ctx) {
        mathCollector.collect(Operators.AND.name());
    }
}
