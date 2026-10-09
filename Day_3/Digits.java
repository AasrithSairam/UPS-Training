import java.util.Scanner;

class Digits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        
        do{
            num=num/10;
            count++;
        }while(num!=0);
        
        System.out.println(count);
    }
}