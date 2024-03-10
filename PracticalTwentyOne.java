import java.util.ArrayList;

public class PracticalTwentyOne {
    private ArrayList<Double> elements;

    public PracticalTwentyOne() {
        elements = new ArrayList<>();
    }

    public void addElement(double element) {
        elements.add(element);
    }

    public void removeElement(int index) {
        elements.remove(index);
    }

    public double getElement(int index) {
        return elements.get(index);
    }

    public int getSize() {
        return elements.size();
    }

    public void printVector() {
        for (double element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PracticalTwentyOne vector = new PracticalTwentyOne();
        vector.addElement(1.0);
        vector.addElement(2.0);
        vector.addElement(3.0);

        System.out.println("Vector elements:");
        vector.printVector();
        System.out.println("Size of vector: " + vector.getSize());

        vector.removeElement(1);

        System.out.println("Vector elements after removing element at index 1:");
        vector.printVector();
        System.out.println("Size of vector: " + vector.getSize());
    }
}
