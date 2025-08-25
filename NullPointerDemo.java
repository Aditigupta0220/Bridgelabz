public class NullPointerDemo {
    public static void main(String[] args) {
        generateNullPointer(); // This will crash
        handleNullPointer();   // This will handle it gracefully
    }

    public static void generateNullPointer() {
        String text = null;
        System.out.println(text.length()); // Throws NullPointerException
    }

    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
