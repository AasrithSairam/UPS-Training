/**
 * Task 4: Find smallest element in array (With Functions)
 */
public class ArraySmallest {

    // Function to find the smallest element in an array
    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null.");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 77, 99, 3, 56};

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int smallest = findSmallest(numbers);
        System.out.println("Smallest element in the array: " + smallest);
    }
}
