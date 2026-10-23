import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeManager {

    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        void display() {
            System.out.println("ID: " + id + " | Name: " + name + " | Dept: " + department + " | Salary: " + salary);
        }
    }

    private static final String FILE_NAME = "employees_data.txt";
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static HashMap<Integer, Employee> employeeMap = new HashMap<>();
    private static HashSet<Integer> idSet = new HashSet<>();

    public static void loadEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String dept = parts[2].trim();
                    double salary = Double.parseDouble(parts[3].trim());

                    Employee emp = new Employee(id, name, dept, salary);
                    employeeList.add(emp);
                    employeeMap.put(id, emp);
                    idSet.add(id);
                }
            }
            System.out.println("Loaded " + employeeList.size() + " existing employee records from " + FILE_NAME);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

    public static void saveEmployees() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Employee emp : employeeList) {
                bw.write(emp.id + "," + emp.name + "," + emp.department + "," + emp.salary);
                bw.newLine();
            }
            System.out.println("Records successfully saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        loadEmployees();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Employee Record Manager ===");

        while (running) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All");
            System.out.println("6. Save and Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number (1-6).");
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Employee ID: ");
                        int id = Integer.parseInt(sc.nextLine().trim());

                        if (idSet.contains(id)) {
                            System.out.println("Error: Employee ID " + id + " already exists in the system!");
                            break;
                        }

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine().trim();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine().trim();

                        System.out.print("Enter Salary: ");
                        double salary = Double.parseDouble(sc.nextLine().trim());

                        Employee emp = new Employee(id, name, dept, salary);
                        employeeList.add(emp);
                        employeeMap.put(id, emp);
                        idSet.add(id);

                        System.out.println("Employee added successfully!");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid numeric input! Please enter valid digits.");
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = Integer.parseInt(sc.nextLine().trim());

                        Employee foundEmp = employeeMap.get(searchId);
                        if (foundEmp != null) {
                            System.out.println("--- Employee Found ---");
                            foundEmp.display();
                        } else {
                            System.out.println("Employee with ID " + searchId + " not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID format!");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter Employee ID to update salary: ");
                        int updateId = Integer.parseInt(sc.nextLine().trim());

                        Employee empToUpdate = employeeMap.get(updateId);
                        if (empToUpdate != null) {
                            System.out.print("Enter New Salary: ");
                            double newSalary = Double.parseDouble(sc.nextLine().trim());
                            empToUpdate.salary = newSalary;
                            System.out.println("Salary updated successfully for " + empToUpdate.name + "!");
                        } else {
                            System.out.println("Employee with ID " + updateId + " not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format!");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = Integer.parseInt(sc.nextLine().trim());

                        if (idSet.contains(deleteId)) {
                            idSet.remove(deleteId);
                            Employee removedEmp = employeeMap.remove(deleteId);
                            employeeList.remove(removedEmp);

                            System.out.println("Employee " + removedEmp.name + " (ID: " + deleteId + ") deleted successfully!");
                        } else {
                            System.out.println("Employee with ID " + deleteId + " not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID format!");
                    }
                    break;

                case 5:
                    if (employeeList.isEmpty()) {
                        System.out.println("No employee records currently in memory.");
                    } else {
                        System.out.println("\n--- All Employee Records ---");
                        for (Employee e : employeeList) {
                            e.display();
                        }
                    }
                    break;

                case 6:
                    saveEmployees();
                    running = false;
                    System.out.println("Exiting Employee Record Manager. Have a great day!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 6.");
            }
        }
        sc.close();
    }
}
