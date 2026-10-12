package lab_sheet_7.Q07;

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

class PasswordChecker {
    void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must have at least 6 characters.");
        }
        System.out.println("Password accepted.");
    }
}

public class PasswordMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        PasswordChecker checker = new PasswordChecker();

        try {
            checker.checkPassword(password);
        } catch (InvalidPasswordException exception) {
            System.out.println("Invalid password: " + exception.getMessage());
        }
    }
}