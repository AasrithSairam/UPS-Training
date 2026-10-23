public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
