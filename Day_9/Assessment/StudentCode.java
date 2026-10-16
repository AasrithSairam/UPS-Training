class Student {
    String name; 
    int total;
    double avg;
    char grade;

    Student(String n, int m1, int m2, int m3, int m4, int m5) {
        name = n;
        total = m1 + m2 + m3 + m4 + m5;
        avg = total / 5.0;
        if (avg >= 90) grade = 'A';
        else if (avg >= 75) grade = 'B';
        else if (avg >= 60) grade = 'C';
        else if (avg >= 40) grade = 'D';
        else grade = 'F';
    }

    void display() {
        System.out.println("Name: " + name + " | Total: " + total + " | Average: " + avg + " | Grade: " + grade);
    }
}

public class StudentCode {
    public static void main(String[] args) {
        Student s1 = new Student("aasrith", 95, 96, 87, 98, 86);
        Student s2 = new Student("rohith", 90, 98, 96, 83, 84);
        Student s3 = new Student("senthil", 87, 81, 94, 90, 80);

        Student topper = s1;
        if (s2.total > topper.total) topper = s2;
        if (s3.total > topper.total) topper = s3;

        System.out.println("--- Student Details ---");
        s1.display();
        s2.display();
        s3.display();

        System.out.println("\n--- Class Topper ---");
        System.out.println("Topper: " + topper.name + " | Total: " + topper.total + " | Grade: " + topper.grade);
    }
}
