import java.io.IOException;

public class StudentService {
    private StudentDao dao;

    public StudentService() {
        dao = new StudentDao();
    }

    public void addStudentProcess(int id, String name) {
        try {
            Student newStudent = new Student(id, name);
            dao.writeStudent(newStudent);
        } catch (IOException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    public void viewAllStudents() {
        try {
            dao.readStudents();
        } catch (IOException e) {
            System.out.println("Error reading students: " + e.getMessage());
        }
    }

    public void removeStudentProcess(int id) {
        try {
            dao.deleteStudent(id);
        } catch (IOException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}