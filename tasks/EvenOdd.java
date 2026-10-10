public class EvenOdd {
    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num + " is " + checkEvenOdd(num));
    }
}
