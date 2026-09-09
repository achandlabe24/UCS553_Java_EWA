package Assignment_Week_5;

class InvalidUsernameException extends Exception { public InvalidUsernameException(String m) { super(m); } }
class InvalidPasswordException extends Exception { public InvalidPasswordException(String m) { super(m); } }
class AccountLockedException extends Exception { public AccountLockedException(String m) { super(m); } }

public class Q6_LoginSystem {
    public static void main(String[] args) {
        int attempts = 0;
        boolean loggedIn = false;
        
        try {
            while (attempts < 3 && !loggedIn) {
                attempts++;
                try {
                    String user = "admin"; // Simulated input
                    String pass = "wrongpass"; // Simulated input
                    
                    if (!user.equals("admin")) throw new InvalidUsernameException("User not found");
                    if (!pass.equals("1234")) throw new InvalidPasswordException("Wrong password");
                    
                    loggedIn = true;
                    System.out.println("Login successful!");
                } catch (InvalidUsernameException | InvalidPasswordException e) {
                    System.out.println(e.getMessage() + ". Attempt " + attempts + " of 3.");
                    if (attempts == 3) throw new AccountLockedException("Max attempts reached. Account locked.");
                }
            }
        } catch (AccountLockedException e) {
            System.out.println("CRITICAL: " + e.getMessage());
        } finally {
            System.out.println("Login module closed. Final state: " + (loggedIn ? "Authenticated" : "Locked out"));
        }
    }
}