package interpreter.math;

public class MathElement {

    public static boolean isOperator(String name) {
        try {
            Operators.valueOf(name);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public static boolean isValue(String name) {
        return !isOperator(name);
    }

    public static Double parseDouble(String string) {
        try {
            return Double.parseDouble(string);
        }
        catch (Exception ignored) {}
        return null;
    }

    public static Integer parseInt(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (Exception ignored) {}
        return null;
    }

    public static Boolean parseBoolean(String string) {
        try {
            return Boolean.parseBoolean(string);
        }
        catch (Exception ignored) {}
        return null;
    }
}
