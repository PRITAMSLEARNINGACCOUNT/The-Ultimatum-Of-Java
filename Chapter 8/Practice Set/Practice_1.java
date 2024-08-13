class Employee {
    String Employee_Name;
    int Salary;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return Employee_Name;
    }

    public void setName(String New_Name) {
        Employee_Name = New_Name;
    }

}

public class Practice_1 {
    public static void main(String[] args) {
        Employee Employee_1 = new Employee();
        Employee_1.setName("PRITAMSTECH");
        Employee_1.Salary = 1000000;
        System.out.println("The name of the employee is: " + Employee_1.getName());
        System.out.println("The salary of " + Employee_1.getName() + " is: " + Employee_1.getSalary());

    }
}
