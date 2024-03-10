// find largest and smallest elements of an array in java 

public class PracticalSeven {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 3};
        
        int min = array[0];
        int max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
