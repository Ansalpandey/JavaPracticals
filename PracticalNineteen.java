// Parent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown in color.");
    }
}

// Main class
public class PracticalNineteen {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); // Accessing eat() method from Animal class
        labrador.bark(); // Accessing bark() method from Dog class
        labrador.color(); // Accessing color() method from Labrador class
    }
}
