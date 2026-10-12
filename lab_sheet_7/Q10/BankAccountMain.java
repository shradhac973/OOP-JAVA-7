package lab_sheet_7.Q10;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money in the account.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            account.withdraw(150.0);
        } catch (InsufficientFundsException exception) {
            System.out.println("Bank error: " + exception.getMessage());
        } catch (IllegalArgumentException exception) {
            System.out.println("Input error: " + exception.getMessage());
        }

        try {
            account.withdraw(-10.0);
        } catch (InsufficientFundsException exception) {
            System.out.println("Bank error: " + exception.getMessage());
        } catch (IllegalArgumentException exception) {
            System.out.println("Input error: " + exception.getMessage());
        }
    }
}