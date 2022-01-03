package interpreter;

public class VariableValue {
    private final String stringValue;

    public VariableValue(String value) {
        stringValue = value;
    }

    public Double getDoubleValue() {
        try {
            return Double.parseDouble(stringValue);
        }
        catch (NumberFormatException ignored) {}
        return null;
    }

    public Integer getIntValue() {
        try {
            return Integer.parseInt(stringValue);
        }
        catch (NumberFormatException ignored) {}
        return null;
    }

    public Boolean getBooleanValue() {
        try {
            return Boolean.parseBoolean(stringValue);
        }
        catch (NumberFormatException ignored) {}
        return null;
    }

    public String getStringValue() {
        return stringValue;
    }

    public static boolean isVariable(String string) {
        return string.charAt(0) == ':';
    }
}
