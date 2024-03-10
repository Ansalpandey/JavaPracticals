// write a program to shift every element of an array to circularly right. E.g.-  INPUT : 1 2 3 4 5  OUTPUT : 5 1 2 3 4 in java 

public class PracticalEight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        // Store the last element of the array
        int temp = arr[n - 1];
        
        // Shift each element to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Assign the stored last element to the first position
        arr[0] = temp;
        
        // Print the shifted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
