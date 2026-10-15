import java.util.Arrays;

/**
 * Task 6: Copy one array to another using copyOf() (With Functions)
 */
public class ArrayCopy {

    // Function to copy an entire array using Arrays.copyOf()
    public static int[] copyEntireArray(int[] original) {
        return Arrays.copyOf(original, original.length);
    }

    // Function to copy an array with a custom specified target length
    public static int[] copyWithCustomLength(int[] original, int newLength) {
        return Arrays.copyOf(original, newLength);
    }

    public static void main(String[] args) {
        int[] originalArray = {5, 10, 15, 20, 25};

        // Copying the array
        int[] copiedArray = copyEntireArray(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array:   " + Arrays.toString(copiedArray));

        // Verifying independent copy by modifying copiedArray
        copiedArray[0] = 999;
        System.out.println("\n--- After modifying copiedArray[0] to 999 ---");
        System.out.println("Original Array (unchanged): " + Arrays.toString(originalArray));
        System.out.println("Copied Array (modified):    " + Arrays.toString(copiedArray));

        // Copy with larger length (padded with 0s)
        int[] extendedCopy = copyWithCustomLength(originalArray, 8);
        System.out.println("\nExtended Copy (length 8): " + Arrays.toString(extendedCopy));
    }
}
