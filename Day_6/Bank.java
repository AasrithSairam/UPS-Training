abstract class RBI {
    abstract void rules();
}
class SBI extends RBI {
    void rules() {
        System.out.println("minimum balance to main in SBI is thousand rs");
    }
}
class IndianBank extends RBI {
    void rules() {
        System.out.println("minimum balance to main in Indian Bank is five hundred rs");
    }
}
public class Bank{
    public static void main(String[] args) {
        RBI bank1 = new SBI();
        bank1.rules();

        RBI bank2 = new IndianBank();
        bank2.rules();
    }
}