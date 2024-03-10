import java.util.Scanner;

public class PracticalFive {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int max = findMaximum(num1, num2, num3);
            int min = findMinimum(num1, num2, num3);

            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
    }

    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static int findMinimum(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
}
