import java.util.Scanner;

public class Q3_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double num1 = Double.parseDouble(sc.nextLine()); // Might throw NumberFormatException
            
            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.nextLine().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = Double.parseDouble(sc.nextLine());
            
            double result = 0;
            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                    result = num1 / num2; 
                    break;
                default: 
                    throw new IllegalArgumentException("Invalid operator");
            }
            System.out.println("Result: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}