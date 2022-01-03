package interpreter.math;

import interpreter.Turtle;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class TestMathStatement {

    @Test
    public void testAdding() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("2");
        linkedList.addLast("PLUS");
        linkedList.addLast("2");
        linkedList.addLast("PLUS");
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(6, value.getIntValue());

    }

    @Test
    public void testMinus() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("5");
        linkedList.addLast("MINUS");
        linkedList.addLast("1");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(4, value.getIntValue());

    }

    @Test
    public void testAbs() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("ABS");
        linkedList.addLast("-5");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(5, value.getIntValue());

    }

    @Test
    public void testAbsDouble() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("ABS");
        linkedList.addLast("-5.7");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(5.7, value.getDoubleValue());


    }

    @Test
    public void testComp() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("2");
        linkedList.addLast("==");
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(true, value.getBooleanValue());

    }

    @Test
    public void testAnd() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast("AND");
        linkedList.addLast("1");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(true, value.getBooleanValue());

    }

    @Test
    public void testOr() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("0");
        linkedList.addLast("OR");
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(false, value.getBooleanValue());

    }

    @Test
    public void testMinusSingle() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("-");
        linkedList.addLast("5.0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(-5, value.getDoubleValue());

    }

    @Test
    public void testNot() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("NOT");
        linkedList.addLast("1.0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(false, value.getBooleanValue());

    }

    @Test
    public void testRemainder() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("7");
        linkedList.addLast("REMAINDER");
        linkedList.addLast("5");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(2, value.getIntValue());

    }

    @Test
    public void testDivide() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("16");
        linkedList.addLast("/");
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(2, value.getIntValue());

    }

    @Test
    public void testMultiply() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("32");
        linkedList.addLast("MULTIPLY");
        linkedList.addLast("2");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(64, value.getIntValue());

    }

    @Test
    public void testPow() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("2");
        linkedList.addLast("POW");
        linkedList.addLast("3");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(8, value.getIntValue());

    }

    @Test
    public void testExp() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("EXP");
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(1, value.getDoubleValue());

    }

    @Test
    public void testLog() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("10");
        linkedList.addLast("LOG");
        linkedList.addLast("10");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(1, value.getDoubleValue());

    }

    @Test
    public void testLn() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("LN");
        linkedList.addLast("1");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(0, value.getDoubleValue());

    }

    @Test
    public void testInt() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("INT");
        linkedList.addLast("2.7");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(3, value.getDoubleValue());

    }

    @Test
    public void testCos() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("COS");
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(1, value.getDoubleValue());

    }

    @Test
    public void testRound() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("ROUND");
        linkedList.addLast("2.99");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(3, value.getDoubleValue());

    }

    @Test
    public void testSin() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("SIN");
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(0, value.getDoubleValue());

    }

    @Test
    public void testSqrt() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("SQRT");
        linkedList.addLast("4");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(2, value.getDoubleValue());

    }

    @Test
    public void testTan() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("TAN");
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(0, value.getDoubleValue());

    }

    @Test
    public void testArcTan() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("ARCTAN");
        linkedList.addLast("0");
        MathStatement statement = new MathStatement(linkedList);
        MathValue value = statement.evaluate(null);

        assertEquals(0, value.getDoubleValue());

    }
}