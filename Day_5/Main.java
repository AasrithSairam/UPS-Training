import java.util.Scanner;

class Employee {
    int id;
    String name;
    void printDetails() {
        System.out.println("ID: "+id+" | Name: "+name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int count=sc.nextInt();
        Employee[] empList=new Employee[count];

        for(int i=0;i<count;i++) {
            empList[i]=new Employee();
            System.out.println("\nEnter details for Employee "+(i+1)+":");
            System.out.print("Enter ID: ");
            empList[i].id=sc.nextInt();
            System.out.print("Enter Name: ");
            empList[i].name=sc.next();
        }

        System.out.println("\nEmployee List: ");
        for(int i=0;i<count;i++) {
            empList[i].printDetails();
        }
        
    }
}