public class Q2_NestedTry {
    public static void main(String[] args) {
        try { // Outer Block
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try block starting.");
            
            try { // Inner Block
                int result = numbers[1] / 0; // Generates ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Division by zero.");
            }
            
            // This will generate an exception caught by the outer block
            System.out.println(numbers[5]); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Array index invalid.");
        }
    }
}