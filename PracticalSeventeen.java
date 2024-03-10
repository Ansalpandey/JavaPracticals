public class PracticalSeventeen {
    // Static variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block executed");
        count = 10;
    }

    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        displayCount();
    }
}
