// Custom Exception
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) { super(message); }
}

public class Q4_StudentResult {
    public static void main(String[] args) {
        int[] marks = {85, 92, -5, 78}; // -5 will trigger the exception
        
        try {
            int total = 0;
            for (int mark : marks) {
                if (mark < 0 || mark > 100) {
                    throw new InvalidMarksException("Marks must be between 0 and 100. Entered: " + mark);
                }
                total += mark;
            }
            double percentage = (double) total / marks.length;
            System.out.println("Total: " + total + ", Percentage: " + percentage + "%");
        } catch (InvalidMarksException e) {
            System.out.println("Result Processing Failed: " + e.getMessage());
        }
    }
}