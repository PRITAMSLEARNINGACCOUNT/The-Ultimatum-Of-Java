import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    // ================================
    // TODO: Implement the constructor to initialize name and salary.
    // Implement getDetails() method to return employee details in the required
    // format.
    //
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getDetails() {
        return "Employee: " + this.name + ", Salary: " + Double.toString(this.salary);
    }
}

public class W07_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String empName = scanner.next();
        double empSalary = scanner.nextDouble();

        Employee emp = new Employee(empName, empSalary);
        System.out.print(emp.getDetails());

        scanner.close();
    }
}