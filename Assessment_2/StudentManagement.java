import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManagement {
    static class Student {
        int rollNo;
        String name;
        int mark;

        Student(int rollNo, String name, int mark) {
            this.rollNo = rollNo;
            this.name = name;
            this.mark = mark;
        }

        void display() {
            System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Mark: " + mark);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Aasrith", 92));
        students.add(new Student(102, "Rohith", 68));
        students.add(new Student(103, "Senthil", 85));
        students.add(new Student(104, "Pooja", 74));
        students.add(new Student(105, "Vijay", 95));

        System.out.println("--- All Students ---");
        for (Student s : students) {
            s.display();
        }

        System.out.println("\n--- Students Scoring Above 75 ---");
        for (Student s : students) {
            if (s.mark > 75) {
                s.display();
            }
        }

        int searchRoll = 103;
        System.out.println("\n--- Searching for Roll Number " + searchRoll + " ---");
        boolean found = false;
        for (Student s : students) {
            if (s.rollNo == searchRoll) {
                System.out.print("Found: ");
                s.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }

        int updateRoll = 102;
        int updatedMark = 82;
        System.out.println("\n--- Updating Mark for Roll Number " + updateRoll + " to " + updatedMark + " ---");
        for (Student s : students) {
            if (s.rollNo == updateRoll) {
                s.mark = updatedMark;
                System.out.print("Updated Record: ");
                s.display();
                break;
            }
        }

        int removeRoll = 104;
        System.out.println("\n--- Removing Student with Roll Number " + removeRoll + " ---");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == removeRoll) {
                System.out.println("Removed Student: " + students.get(i).name);
                students.remove(i);
                break;
            }
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.mark - s1.mark;
            }
        });

        System.out.println("\n--- Students Sorted by Marks (High to Low) ---");
        for (Student s : students) {
            s.display();
        }
    }
}
