package lab_sheet_7.Q04;

import java.util.Scanner;

public class NestedTryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = {11, 22, 33};
        System.out.print("Enter an array index, numerator, and denominator: ");
        int index = input.nextInt();
        int numerator = input.nextInt();
        int denominator = input.nextInt();

        try {
            try {
                System.out.println("Array value: " + values[index]);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Invalid array index.");
            }

            System.out.println("Quotient: " + (numerator / denominator));
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
    }
}