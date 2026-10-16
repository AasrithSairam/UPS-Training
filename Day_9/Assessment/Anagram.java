import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty room";

        // Remove all whitespace and convert to lower case for case-insensitive comparison
        String str1 = s1.replaceAll("\\s+", "").toLowerCase();
        String str2 = s2.replaceAll("\\s+", "").toLowerCase();

        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            isAnagram = Arrays.equals(arr1, arr2);
        }

        System.out.println("String 1: \"" + s1 + "\"");
        System.out.println("String 2: \"" + s2 + "\"");
        System.out.println("Output: " + (isAnagram ? "Anagram" : "Not Anagram"));
    }
}