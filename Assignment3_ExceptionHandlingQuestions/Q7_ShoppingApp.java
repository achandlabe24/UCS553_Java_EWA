// 1. Define the Hierarchy using inheritance
class ApplicationException extends Exception { public ApplicationException(String m) { super(m); } }
class ProductException extends ApplicationException { public ProductException(String m) { super(m); } }
class ProductNotFoundException extends ProductException { public ProductNotFoundException(String m) { super(m); } }
class OutOfStockException extends ProductException { public OutOfStockException(String m) { super(m); } }

class PaymentException extends ApplicationException { public PaymentException(String m) { super(m); } }
class InsufficientFundsException extends PaymentException { public InsufficientFundsException(String m) { super(m); } }

// 2. Implement the logic
public class Q7_ShoppingApp {
    public static void searchProduct(String id) throws ProductNotFoundException {
        if(id.equals("999")) throw new ProductNotFoundException("Item 999 does not exist in catalog.");
    }

    public static void main(String[] args) {
        try {
            searchProduct("999");
        } catch (ProductNotFoundException e) {
            System.out.println("Search Error: " + e.getMessage());
        } catch (ApplicationException e) {
            // This catches any other app-related exception in the hierarchy
            System.out.println("General App Error: " + e.getMessage());
        }
    }
}