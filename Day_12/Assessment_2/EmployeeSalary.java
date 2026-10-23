class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Basic Salary: " + basicSalary + " | Final Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Hours: " + hoursWorked + " | Rate: " + hourlyRate + " | Final Salary: " + calculateSalary());
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Aasrith", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Rohith", 45, 600);

        System.out.println("=== Employee Salary System (Polymorphism) ===");
        emp1.display();
        emp2.display();
    }
}
