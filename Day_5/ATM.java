public class ATM {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0) {
            this.balance=balance;
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: "+getBalance());
    }

    public void deposit(double amount) {
        if(amount>0) {
            setBalance(getBalance()+amount);
            System.out.println("Deposited: "+amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if(amount>0 && amount<=getBalance()) {
            setBalance(getBalance()-amount);
            System.out.println("Withdrawn: "+amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}