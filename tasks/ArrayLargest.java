/**
 * Task 3: Find largest element in array (With Functions)
 */
public class ArrayLargest {

    // Function to find the largest element in an array
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 77, 99, 3, 56};

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int largest = findLargest(numbers);
        System.out.println("Largest element in the array: " + largest);
    }
}
