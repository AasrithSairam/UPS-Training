import java.util.Arrays;

/**
 * Task 9: Sum of array elements (With Functions)
 */
public class ArraySum {

    // Function to calculate the sum of all elements in an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Function to calculate the average of elements in an array
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        return (double) calculateSum(arr) / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + calculateSum(numbers));
        System.out.println("Average of array elements: " + calculateAverage(numbers));
    }
}
