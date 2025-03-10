package access_modifiers;

class Employee {
    public int employeeID; 
    protected String department; 
    private double salary; 

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    // Display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerInfo() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); 
        System.out.println("Department: " + department); 
        System.out.println("Salary:" + getSalary()); 
        System.out.println("Team Name: " + teamName);
    }
}

// Main class to test
public class EmployeeRecord {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "HR", 60000);
        emp1.displayEmployeeInfo();

        emp1.setSalary(65000);
        System.out.println("Updated Salary: " + emp1.getSalary());

        Manager mgr1 = new Manager(201, "IT", 90000, "Tech Team");
        mgr1.displayManagerInfo();
    }
}