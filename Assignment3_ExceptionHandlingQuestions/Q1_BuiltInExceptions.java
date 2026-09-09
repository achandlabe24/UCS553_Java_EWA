public class Q1_BuiltInExceptions {
    public static void main(String[] args) {
        // 1. ArithmeticException
        try { int a = 10 / 0; } 
        catch (ArithmeticException e) { System.out.println("Caught: " + e); }

        // 2. NullPointerException
        try { String s = null; s.length(); } 
        catch (NullPointerException e) { System.out.println("Caught: " + e); }

        // 3. ArrayIndexOutOfBoundsException
        try { int[] arr = new int[5]; arr[10] = 50; } 
        catch (ArrayIndexOutOfBoundsException e) { System.out.println("Caught: " + e); }

        // 4. NumberFormatException
        try { int num = Integer.parseInt("XYZ"); } 
        catch (NumberFormatException e) { System.out.println("Caught: " + e); }
    }
}