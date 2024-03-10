// If the marks of robert in three subjects are entered through keyboard (each out of 100), write a program to calculate his total marks and percentage marks. in java 

import java.util.Scanner;

public class PracticalTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks for subject 1: ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Enter the marks for subject 2: ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Enter the marks for subject 3: ");
        int subject3Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        double percentageMarks = (totalMarks / 300.0) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentageMarks + "%");

        scanner.close();
    }
}
