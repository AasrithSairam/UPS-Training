public class VowelCount {
    public static int countVowels(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String text = "programming";
        System.out.println("Number of vowels in '" + text + "' is " + countVowels(text));
    }
}
