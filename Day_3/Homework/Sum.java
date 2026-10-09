import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many numbers: ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }
        
        System.out.println("Total Sum: " + sum);
    }
}