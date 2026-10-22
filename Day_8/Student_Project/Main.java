import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        boolean running = true;

        System.out.println("Welcome to the Student Management System!");

        while (running) {
            System.out.println("\n1. Add Student  2. View Students  3. Delete Student  4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    service.addStudentProcess(id, name);
                    break;
                case 2:
                    service.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter ID of student to delete: ");
                    int delId = sc.nextInt();
                    service.removeStudentProcess(delId);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}