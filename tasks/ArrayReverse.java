/**
 * Task 5: Reverse an array (With Functions)
 */
public class ArrayReverse {

    // Function to reverse an array in-place using two-pointer technique
    public static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Function that returns a new reversed array without modifying original
    public static int[] getReversedCopy(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Function to print array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        System.out.print("Original Array: ");
        printArray(numbers);

        reverseInPlace(numbers);

        System.out.print("Reversed Array: ");
        printArray(numbers);
    }
}
