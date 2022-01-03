package interpreter.environment;

import interpreter.Environment;
import interpreter.VariableValue;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEnvironment {

    @Test
    public void testAddingVariables() {
        String firstVariableName = ":x";
        String secondVariableName = ":y";

        VariableValue firstVariableValue = new VariableValue("100");
        VariableValue secondVariableValue = new VariableValue("50.6");

        Environment environment = new Environment();
        environment.addVariable(firstVariableName, firstVariableValue);
        environment.addVariable(secondVariableName, secondVariableValue);
        int firstValue = Integer.parseInt(environment.getStringVariable(firstVariableName));
        double secondValue = Double.parseDouble(environment.getStringVariable(secondVariableName));

        assertEquals(100, firstValue);
        assertEquals(50.6, secondValue, 0.0001);
    }

    @Test
    public void testUsingUndeclaredVariable() {
        String variableName = ":PI";
        Environment environment = new Environment();
        IllegalStateException thrown = assertThrows(IllegalStateException.class, () ->
                environment.getVariable(variableName));
        assertEquals("There is no declared variable named: " + variableName , thrown.getMessage());
    }

    @Test
    public void shadowingVariable() {
        String firstVariableName = ":x";

        VariableValue firstVariableValue = new VariableValue("100");
        VariableValue secondVariableValue = new VariableValue("50");

        Environment environment = new Environment();
        environment.addVariable(firstVariableName, firstVariableValue);
        environment.enterBlock();
        environment.addVariable(firstVariableName, secondVariableValue);

        int secondValue = Integer.parseInt(environment.getStringVariable(firstVariableName));
        assertEquals(50, secondValue);

        environment.exitBlock();

        int firstValue = Integer.parseInt(environment.getStringVariable(firstVariableName));
        assertEquals(100, firstValue);
    }
}
