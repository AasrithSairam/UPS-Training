/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.StudentDAO;
import Modal.Student;

public class StudentService {
    private StudentDAO dao = new StudentDAO();
    
    public void addStudent(int id, String name) {
        try {
            dao.insert(new Student(id, name));
            System.out.println("Record added successfully!");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
    
    public void updateStudent(int id, String name) {
        try {
            int rows = dao.update(new Student(id, name));
            if(rows > 0) System.out.println("Record updated successfully!");
            else System.out.println("Record not found.");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
    
    public void deleteStudent(int id) {
        try {
            int rows = dao.delete(id);
            if(rows > 0) System.out.println("Record deleted successfully!");
            else System.out.println("Record not found.");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
    
    public void displayAll() {
        try {
            System.out.println("\n--- Student Records ---");
            dao.viewAll();
            System.out.println("-----------------------");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
}