package lab_sheet_7.Q02;

import java.util.Scanner;

public class ArrayIndexMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Enter an index from 0 to 4: ");
        int index = input.nextInt();

        try {
            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index. The array has indexes 0 through 4.");
        }
    }
}