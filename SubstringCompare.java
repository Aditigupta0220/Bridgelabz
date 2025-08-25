import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();

        String manualSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        boolean isSame = compareUsingCharAt(manualSub, builtInSub);

        System.out.println("Manual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + isSame);
    }

    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}