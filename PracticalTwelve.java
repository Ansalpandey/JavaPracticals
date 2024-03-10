public class PracticalTwelve {
    private int value;

    // Default constructor
    public PracticalTwelve() {
        value = 0;
    }

    // Constructor with one parameter
    public PracticalTwelve(int val) {
        value = val;
    }

    // Constructor with two parameters
    public PracticalTwelve(int val1, int val2) {
        value = val1 + val2;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        PracticalTwelve obj1 = new PracticalTwelve(); // Using default constructor
        PracticalTwelve obj2 = new PracticalTwelve(5); // Using constructor with one parameter
        PracticalTwelve obj3 = new PracticalTwelve(2, 3); // Using constructor with two parameters

        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
        System.out.println("Value of obj3: " + obj3.getValue());
        
    }
}
