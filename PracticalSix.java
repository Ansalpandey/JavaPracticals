// Define a method to print the prime factors of a number in java

import java.util.Scanner;

public class PracticalSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Prime factors of " + number + ":");
        printPrimeFactors(number);
    }

    public static void printPrimeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
        }
    }
}
