/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modal.Student;
import Util.DBConnection;
import java.sql.*;

public class StudentDAO {
    
    public void insert(Student st) throws Exception {
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES(?,?)")) {
            ps.setInt(1, st.getId());
            ps.setString(2, st.getName());
            ps.executeUpdate();
        }
    }
    
    public int update(Student st) throws Exception {
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
            ps.setString(1, st.getName());
            ps.setInt(2, st.getId());
            return ps.executeUpdate();
        }
    }
    
    public int delete(int id) throws Exception {
        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id=?")) {
            ps.setInt(1, id);
            return ps.executeUpdate();
        }
    }
    
    public void viewAll() throws Exception {
        try(Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " | Name: " + rs.getString("name"));
            }
        }
    }
}
