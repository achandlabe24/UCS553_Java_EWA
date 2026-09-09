class InsufficientBalanceException extends Exception { public InsufficientBalanceException(String m) { super(m); } }
class InvalidAmountException extends Exception { public InvalidAmountException(String m) { super(m); } }
class AccountNotFoundException extends Exception { public AccountNotFoundException(String m) { super(m); } }

class Bank {
    double balance = 5000;
    
    // The 'throws' keyword propagates the exception to the caller
    public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Withdrawal must be positive.");
        if (amount > balance) throw new InsufficientBalanceException("Not enough funds.");
        balance -= amount;
        System.out.println("Withdrawn. New Balance: " + balance);
    }
}

public class Q5_BankingApp {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        try {
            myBank.withdraw(6000); // This will fail and jump to catch
        } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }
    }
}