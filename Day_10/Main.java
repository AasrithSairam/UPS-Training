import java.util.*;
class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

public class Main{
    public static void main(String args[]){

        ArrayList<Student> students=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
        
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
                    Student s = new Student(id,name);
                    s.setId(id);
                    s.setName(name);
                    students.add(s);
                    break;
                case 2:
                    for(Student i: students){
                        System.out.println(i.getId()+" "+i.getName());
                    }
                    break;
                
                case 3:
                    System.out.print("Enter ID of student to delete: ");
                    int delId=sc.nextInt();
                    for(Student i: students){
                        if(i.getId()==delId){
                            students.remove(i);
                            System.out.println("Student deleted successfully!");
                            break;
                        }
                    }
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