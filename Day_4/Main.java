import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Student 1 details:");
System.out.print("Name: ");
String n1=sc.nextLine();
System.out.print("Age: ");
int a1=sc.nextInt();
System.out.print("Mobile: ");
long m1=sc.nextLong();
sc.nextLine();
Student s1=new Student(n1,a1,m1);

System.out.println("Enter Student 2 details:");
System.out.print("Name: ");
String n2=sc.nextLine();
System.out.print("Age: ");
int a2=sc.nextInt();
System.out.print("Mobile: ");
long m2=sc.nextLong();
sc.nextLine();
Student s2=new Student(n2,a2,m2);

System.out.println("Enter Student 3 details:");
System.out.print("Name: ");
String n3=sc.nextLine();
System.out.print("Age: ");
int a3=sc.nextInt();
System.out.print("Mobile: ");
long m3=sc.nextLong();
Student s3=new Student(n3,a3,m3);

System.out.println("\nStudent 1:");
s1.display();
System.out.println("\nStudent 2:");
s2.display();
System.out.println("\nStudent 3:");
s3.display();
}
}