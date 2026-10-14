class Student {
    int id;
    String name;

    Student() {
        id=0;
        name="Unknown";
    }

    Student(String n) {
        id=0;
        name=n;
    }

    Student(int i,String n) {
        id=i;
        name=n;
    }

    void display() {
        System.out.println("ID: "+id+" , Name: "+name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(); 
        Student s2=new Student("aasrith"); 
        Student s3=new Student(101,"rohan"); 

        s1.display();
        s2.display();
        s3.display();
    }
}