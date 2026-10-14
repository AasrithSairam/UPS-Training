
public class MergeChar {
    public static void main(String[] args) {
        char[] arr1={'a','b','c'};
        char[] arr2={'d','e','f'};

        char[] merged=new char[arr1.length+arr2.length];

        for(int i=0;i<merged.length;i++) {
            if(i<arr1.length) {
                merged[i]=arr1[i];
            } 
            else {
                merged[i]=arr2[i-arr1.length];
            }
        }
        System.out.println(merged);
    }
}