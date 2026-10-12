package lab_sheet_7.Q06;

import java.util.Scanner;

class AgeChecker {
    void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is eligible.");
    }
}

public class AgeCheckMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        AgeChecker checker = new AgeChecker();

        try {
            checker.checkAge(age);
        } catch (IllegalArgumentException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}