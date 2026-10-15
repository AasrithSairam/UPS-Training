/**
 * Task 2: Sort an array without using Arrays.sort() (With Functions)
 */
public class ArraySort {

    // Function to sort an array in ascending order without using Arrays.sort()
    public static void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to display array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original Array: ");
        printArray(numbers);

        sortAscending(numbers);

        System.out.print("Sorted Array (Ascending): ");
        printArray(numbers);
    }
}
