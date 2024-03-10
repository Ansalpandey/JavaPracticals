public class PracticalThirteen {
    public static void main(String[] args) {
        PracticalThirteen obj = new PracticalThirteen();
        
        // Call the overloaded methods
        obj.display();
        obj.display(10);
        obj.display("Hello");
    }
    
    // Overloaded method with no parameters
    public void display() {
        System.out.println("This is the display method with no parameters");
    }
    
    // Overloaded method with an integer parameter
    public void display(int num) {
        System.out.println("This is the display method with an integer parameter: " + num);
    }
    
    // Overloaded method with a string parameter
    public void display(String str) {
        System.out.println("This is the display method with a string parameter: " + str);
    }
}
