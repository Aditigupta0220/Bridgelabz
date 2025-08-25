import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Aditi", "Ravi", "Neha"};
        System.out.println("Enter index to access:");
        int index = sc.nextInt();

        generateException(names, index);
        handleException(names, index);
    }

    public static void generateException(String[] arr, int index) {
        System.out.println(arr[index]); // May throw exception
    }

    public static void handleException(String[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}

