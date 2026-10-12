package lab_sheet_7.Q03;

import java.util.Scanner;

public class MultipleCatchMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        String firstText = input.next();
        String secondText = input.next();

        try {
            int first = Integer.parseInt(firstText);
            int second = Integer.parseInt(secondText);
            System.out.println("Quotient: " + (first / second));
        } catch (NumberFormatException exception) {
            System.out.println("Both inputs must be valid integers.");
        } catch (ArithmeticException exception) {
            System.out.println("The second number cannot be zero.");
        }
    }
}