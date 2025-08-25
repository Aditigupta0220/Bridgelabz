import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number as string:");
        String text = sc.next();

        generateException(text);
        handleException(text);
    }

    public static void generateException(String str) {
        int num = Integer.parseInt(str); // Throws if not a number
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
