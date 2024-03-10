class Parent {
    public void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child class method");
    }
}

public class PracticalFifteen {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Output: Parent class method

        Child child = new Child();
        child.display(); // Output: Child class method
    }
}
