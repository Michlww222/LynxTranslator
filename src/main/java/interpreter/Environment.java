package interpreter;

import interpreter.statements.Procedure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Environment {

    private final HashMap<String, Procedure> procedureHashMap = new HashMap<>();
    private final LinkedList<HashMap<String, VariableValue>> variableHashMap = new LinkedList<>();

    public Environment() {
        variableHashMap.addFirst(new HashMap<>());
    }

    public void addProcedure(String name, Procedure procedure) {
        procedureHashMap.put(name, procedure);
    }

    public Procedure getProcedure(String name) {
        if (!procedureHashMap.containsKey(name)) {
            throw new IllegalArgumentException("There is no procedure named: " + name);
        }
        return procedureHashMap.get(name);
    }

    public VariableValue getVariable(String name) {
        for (HashMap<String, VariableValue> map: variableHashMap) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
        }
        throw new IllegalStateException("There is no declared variable named: " + name);
    }

    public void addVariable(String name, VariableValue variableValue) {
        variableHashMap.getFirst().put(name, variableValue);
    }

    public void enterBlock() {
        variableHashMap.addFirst(new HashMap<>());
    }

    public void exitBlock() {
        variableHashMap.removeFirst();
    }

    public Set<String> getVariablesNames() {
        Set<String> variablesNamesSet = new HashSet<>();
        for (HashMap<String, VariableValue> variablesHashMap: variableHashMap) {
            variablesNamesSet.addAll(variablesHashMap.keySet());
        }
        return variablesNamesSet;
    }

    public Set<String> getProceduresNames() {
        return procedureHashMap.keySet();
    }

    public String getStringVariable(String name) {
        VariableValue variableValue = getVariable(name);
        return variableValue.getStringValue();
    }

    public void clean() {
        procedureHashMap.clear();
        variableHashMap.clear();
    }
}
