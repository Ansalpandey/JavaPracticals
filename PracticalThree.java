// A school has following rules for grading system: a. Below 25 - F b. 25 to 45 -E c. 45 to 60 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A  Ask user to enter marks and print the corresponding grade in java 


import java.util.Scanner;

public class PracticalThree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            String grade;

            if (marks < 25) {
                grade = "F";
            } else if (marks >= 25 && marks < 45) {
                grade = "E";
            } else if (marks >= 45 && marks < 60) {
                grade = "D";
            } else if (marks >= 60 && marks < 80) {
                grade = "C";
            } else if (marks >= 80 && marks <= 100) {
                grade = "B";
            } else {
                grade = "Invalid marks";
            }

            System.out.println("Grade: " + grade);
        }
    }
}
