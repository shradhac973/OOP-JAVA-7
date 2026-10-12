package lab_sheet_7.Q01;

import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numerator and denominator: ");
        int numerator = input.nextInt();
        int denominator = input.nextInt();

        try {
            int quotient = numerator / denominator;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Division attempt finished.");
        }
    }
}