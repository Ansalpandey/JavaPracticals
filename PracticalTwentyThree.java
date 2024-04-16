//Write a Java program to create an interface called Shape with the getArea() method. Create three classes Circle, Rectangle, and Triangle that implement the Shape interface. Each class should provide the required implementation for the getArea() method:


interface Shape {
  double getArea();
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
      this.radius = radius;
  }

  @Override
  public double getArea() {
      return Math.PI * radius * radius;
  }
}

class Rectangle implements Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
  }

  @Override
  public double getArea() {
      return length * width;
  }
}

class Triangle implements Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
      this.base = base;
      this.height = height;
  }

  @Override
  public double getArea() {
      return 0.5 * base * height;
  }
}

public class PracticalTwentyThree {
  public static void main(String[] args) {
      // Creating instances of each shape and calculating their areas
      Circle circle = new Circle(5);
      Rectangle rectangle = new Rectangle(4, 6);
      Triangle triangle = new Triangle(3, 7);

      // Printing the areas
      System.out.println("Area of Circle: " + circle.getArea());
      System.out.println("Area of Rectangle: " + rectangle.getArea());
      System.out.println("Area of Triangle: " + triangle.getArea());
  }
}



