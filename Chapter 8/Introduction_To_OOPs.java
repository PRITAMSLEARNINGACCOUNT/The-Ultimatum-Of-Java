
class Employee {
    int id;
    String name;

    public void GetSalary() {
        System.out.println("Salary Of The Employee " + name + " is 1000$");
    }

    public void GetDetails() {
        System.out.println("The Name Of The Employee Is " + name + " And The Id Of The Employee Is " + id);
    }

}

public class Introduction_To_OOPs {
    public static void main(String[] args) {
        Employee Employee_1 = new Employee();
        Employee_1.id = 1;
        Employee_1.name = "Rahul";
        Employee_1.GetSalary();
        Employee_1.GetDetails();

    }
}