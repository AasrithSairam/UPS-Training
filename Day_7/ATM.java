class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

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
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount>getBalance()) {
            throw new InsufficientFundsException("Not enough money in your account!");
        }
        if(amount>0) {
            setBalance(getBalance()-amount);
            System.out.println("Withdrawn: "+amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
}