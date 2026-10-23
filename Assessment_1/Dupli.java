public class Dupli {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 8, 2, 9, 4};
        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != -1) {
                    isDuplicate = true;
                    arr[j] = -1;
                }
            }
            if (isDuplicate && arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
            arr[i] = -1; 
        }
        System.out.println();
    }
}