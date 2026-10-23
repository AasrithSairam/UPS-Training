public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 45, 32, 18};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.print("Input Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second-largest distinct element exists.");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
