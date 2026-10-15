import java.util.Arrays;

/**
 * Task 7: Compare two arrays using equals() (With Functions)
 */
public class ArrayEquals {

    // Function to compare two arrays using Arrays.equals()
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 9, 5};
        int[] array4 = {1, 2, 3};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
        System.out.println("Array 4: " + Arrays.toString(array4));

        System.out.println("\nComparison Results:");
        System.out.println("Are Array 1 and Array 2 equal? " + compareArrays(array1, array2));
        System.out.println("Are Array 1 and Array 3 equal? " + compareArrays(array1, array3));
        System.out.println("Are Array 1 and Array 4 equal? " + compareArrays(array1, array4));
    }
}
