package lab_sheet_7.Q05;

import java.util.Scanner;

public class FinallyMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to divide 100 by: ");
        int denominator = input.nextInt();

        try {
            System.out.println("File opened");
            int result = 100 / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("The operation failed because the denominator was zero.");
        } finally {
            System.out.println("Resource closed");
        }
    }
}