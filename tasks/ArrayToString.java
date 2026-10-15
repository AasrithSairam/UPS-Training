import java.util.Arrays;

/**
 * Task 8: Print array using toString() (With Functions)
 */
public class ArrayToString {

    // Function to convert an integer array to a formatted string using Arrays.toString()
    public static String convertArrayToString(int[] arr) {
        return Arrays.toString(arr);
    }

    // Function to directly print an integer array using Arrays.toString()
    public static void printArrayFormatted(String label, int[] arr) {
        System.out.println(label + ": " + convertArrayToString(arr));
    }

    public static void main(String[] args) {
        int[] numbers = {100, 250, 475, 820, 999};
        int[] emptyArray = {};

        System.out.println("--- Array Printing using Arrays.toString() ---");
        printArrayFormatted("Numbers Array", numbers);
        printArrayFormatted("Empty Array", emptyArray);

        // Demonstrating conversion and string manipulation
        String arrayAsString = convertArrayToString(numbers);
        System.out.println("\nDirect string representation: " + arrayAsString);
        System.out.println("String length: " + arrayAsString.length());
    }
}
