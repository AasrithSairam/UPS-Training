import java.util.Scanner;

interface PaymentMode {
    void payment();
}

class UPI implements PaymentMode {
    public void payment() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 6-digit UPI PIN:");
        if (sc.nextInt()==123456) System.out.println("UPI Payment Successful!");
        else System.out.println("Wrong PIN. Payment Failed.");
    }
}

class Cash implements PaymentMode{
    public void payment(){
        System.out.println("Cash Payment Successful!");
    }
}

class Card implements PaymentMode {
    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4-digit Card PIN:");
        if (sc.nextInt() == 1234) System.out.println("Card Payment Successful!");
        else System.out.println("Wrong PIN. Payment Failed.");
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome aasrith");
        System.out.println("How to pay? (upi, cash, card, or cancel)");
        String choice = sc.nextLine();
        
        


        if (choice.equals("cancel")) {
            System.out.println("Payment cancelled.");
        } else if (choice.equals("upi")) {
            UPI myUpi = new UPI();
            myUpi.payment();
            
        } else if (choice.equals("cash")) {
            Cash myCash = new Cash();
            myCash.payment();
        } else if (choice.equals("card")) {
            Card myCard = new Card();
            myCard.payment();
        } else {
            System.out.println("Invalid payment method.");
        }
    }
}