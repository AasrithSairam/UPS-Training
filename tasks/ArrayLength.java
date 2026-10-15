/**
 * Task 1: Find array length (With Functions)
 */
public class ArrayLength {

    // Function to find length of an array using Java's built-in length property
    public static int findLength(int[] arr) {
        return arr.length;
    }

    // Function to calculate array length manually using iteration
    public static int calculateLengthManually(int[] arr) {
        int count = 0;
        for (int num : arr) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 40, 55, 70, 85, 100};

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Length (using built-in .length): " + findLength(numbers));
        System.out.println("Length (using manual iteration): " + calculateLengthManually(numbers));
    }
}
