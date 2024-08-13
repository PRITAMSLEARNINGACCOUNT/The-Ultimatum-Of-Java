class Employee {
    int Employee_ID;
    String Employee_Name;
    int Employee_Salary;

    public Employee(int ID, String Name) {
        Employee_ID = ID;
        Employee_Name = Name;
        Employee_Salary = 0;
    }

    public Employee(int ID, String Name, int Salary) {
        Employee_ID = ID;
        Employee_Name = Name;
        Employee_Salary = Salary;
    }

    public void GetDetails() {
        System.out.println("Employee ID - " + Employee_ID);
        System.out.println("Employee Name - " + Employee_Name);
        if (Employee_Salary == 0) {
            System.out.println(
                    "Employee Salary Is Not Set - Please Set The Employee Salary Using The Overloaded Constructor");
        } else {
            System.out.println("Employee Salary - " + Employee_Salary);
        }
    }
}

public class Quick_Quiz_2 {
    public static void main(String[] args) {
        Employee Object_1 = new Employee(101, "John Doe");
        Object_1.GetDetails();
        Employee Object_2 = new Employee(102, "Jane Doe", 50000);
        Object_2.GetDetails();
    }
}