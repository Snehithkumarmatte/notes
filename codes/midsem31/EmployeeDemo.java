// Base class Employee
class Employee {
    // Method to represent the work of a generic employee
    public void work() {
        System.out.println("Employee is working.");
    }

    // Method to get the salary of an employee
    public double getSalary() {
        return 30000;  // Generic employee salary
    }
}

// Subclass HRManager that extends Employee
class HRManager extends Employee {

    // Overriding the work method to specify HR Manager's work
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    // New method specific to HRManager to add an employee
    public void addEmployee(String employeeName) {
        System.out.println("HR Manager has added a new employee: " + employeeName);
    }
}

// Main class to demonstrate inheritance and method overriding
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee();
        emp.work();  // Calls the Employee's work method
        System.out.println("Employee Salary: " + emp.getSalary());

        // Creating an HRManager object
        HRManager hr = new HRManager();
        hr.work();  // Calls the overridden work method in HRManager
        System.out.println("HR Manager Salary: " + hr.getSalary());

        // Adding an employee using the HRManager's addEmployee method
        hr.addEmployee("John Doe");
    }
}
