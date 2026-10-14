public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        boolean isAnagram=true;

        if(s1.length()!=s2.length()) {
            isAnagram=false;
        } else {
            int[] count=new int[256];
            
            for(int i=0;i<s1.length();i++) {
                count[s1.charAt(i)]++;
                count[s2.charAt(i)]--;
            }
            
            for(int i=0;i<256;i++) {
                if(count[i]!=0) {
                    isAnagram=false;
                    break;
                }
            }
        }
        
        System.out.println(isAnagram?"Anagram":"Not Anagram");
    }
}