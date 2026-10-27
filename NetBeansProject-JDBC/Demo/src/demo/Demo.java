package demo;

import Service.StudentService;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add | 2. Update | 3. Delete | 4. View All | 5. Exit");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int addId = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    service.addStudent(addId, sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int updId = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter new Name: ");
                    service.updateStudent(updId, sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    service.deleteStudent(sc.nextInt());
                    break;
                case 4:
                    service.displayAll();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}