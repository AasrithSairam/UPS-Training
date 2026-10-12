import java.util.Scanner;

public class atmMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM atm=new ATM();
        atm.setBalance(1000);
        boolean running=true;

        while(running) {
            System.out.println("\n1.Check Balance  2.Deposit  3.Withdraw  4.Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();

            if(choice==1) {
                atm.checkBalance();
            } else if(choice==2) {
                System.out.print("Enter deposit amount: ");
                double amt=sc.nextDouble();
                atm.deposit(amt);
            } else if(choice==3) {
                System.out.print("Enter withdraw amount: ");
                double amt=sc.nextDouble();
                atm.withdraw(amt);
            } else if(choice==4) {
                running=false;
                System.out.println("Thank you for using the ATM!");
            } else {
                System.out.println("Invalid choice!");
            }
        }
        
    }
}