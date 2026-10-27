/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author admin
 */
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class DBConnection {
    public static Connection getConnection() throws Exception {
        Properties env = new Properties();
        
        try (FileInputStream fis = new FileInputStream(".env")) {
            env.load(fis);
        }
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            env.getProperty("DB_URL"),
            env.getProperty("DB_USER"),
            env.getProperty("DB_PASS")
        );
    }
}
