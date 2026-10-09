import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(table + "*" + i + " = " + (table * i));
        }
    }
}
