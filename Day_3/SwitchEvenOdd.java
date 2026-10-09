import java.util.Scanner;

class SwitchEvenOdd {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = num % 2;

        switch (ans) {
            case 0: {
                System.out.print("even");
                break;
            }
            default: {
                System.out.print("odd");
            }
        }
    }
}
