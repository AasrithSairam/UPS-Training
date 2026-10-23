class insufficientBalanceException extends Exception{
    insufficientBalanceException(String msg){
        super(msg);
    }
}

class BankAccount{

    int balance=5000;
    void withdraw(int amt) throws insufficientBalanceException{
        if(amt>balance){
            throw new insufficientBalanceException("Insufficient balance error");
        }
        balance=balance-amt;
    }
}

public class Bank{
    public static void main(String[] args){
        BankAccount account=new BankAccount();
        System.out.println("initial balance: "+ account.balance);
        try{
            account.withdraw(6000);
        }
        catch(insufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("available balance is: "+account.balance);
    }
}















