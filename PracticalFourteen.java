class ParentClass {
    public void printParent() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    public void printChild() {
        System.out.println("This is child class");
    }
}

public class PracticalFourteen {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();

        parentObj.printParent(); // Method of parent class by object of parent class
        childObj.printChild(); // Method of child class by object of child class
        childObj.printParent(); // Method of parent class by object of child class
    }
}
