package lab_sheet_7.Q08;

import java.util.Scanner;

class NumberReader {
    int readNumber(Scanner input) throws NumberFormatException {
        String text = input.nextLine();
        return Integer.parseInt(text);
    }
}

public class ThrowsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        NumberReader reader = new NumberReader();

        try {
            int number = reader.readNumber(input);
            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("That input is not a valid integer.");
        }
    }
}