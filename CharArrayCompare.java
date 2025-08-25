import java.util.Scanner;

public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();

        char[] manualArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        boolean isSame = compareCharArrays(manualArray, builtInArray);

        System.out.println("Are both character arrays equal? " + isSame);
    }

    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }
}