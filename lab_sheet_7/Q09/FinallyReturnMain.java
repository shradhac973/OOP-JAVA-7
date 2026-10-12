package lab_sheet_7.Q09;

public class FinallyReturnMain {
    static int getValue() {
        try {
            return 42;
        } finally {
            // finally runs before the returned value reaches the caller.
            System.out.println("Finally block runs before the method returns.");
        }
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println("Returned value: " + value);
    }
}