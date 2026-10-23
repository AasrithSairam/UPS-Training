import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 30};

        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);
        }

        System.out.println("Original Array: [10, 20, 10, 30, 20, 40, 50, 30]");
        System.out.println("Unique values in HashSet: " + uniqueSet);
        System.out.println("Number of unique elements: " + uniqueSet.size());

        boolean contains40 = uniqueSet.contains(40);
        System.out.println("Does set contain 40? " + contains40);

        System.out.println("\nExplanation why output order is not guaranteed:");
        System.out.println("HashSet uses hashing to store elements. It does not maintain any insertion order or sorting order; the iteration order depends solely on internal bucket distribution determined by the element's hashCode().");
    }
}
