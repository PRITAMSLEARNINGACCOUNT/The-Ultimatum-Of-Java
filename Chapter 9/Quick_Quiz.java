class Employee {
    private int Employee_ID;
    private String Employee_Name;

    public void SetEmployee_ID(int ID) {
        Employee_ID = ID;
    }

    public int GetEmployee_ID() {

        return Employee_ID;
    }

    public void SetEmployee_Name(String Name) {
        Employee_Name = Name;
    }

    public String GetEmployee_Name() {
        if (Employee_Name == null) {
            return "Employee Name Is Not Set - Please Set The Employee Name Using The Setter Method";
        }
        return "The Name Of The Employee Is - " + Employee_Name;
    }
}

public class Quick_Quiz {
    public static void main(String[] args) {
        Employee Employee_1 = new Employee();
        Employee_1.SetEmployee_ID(1);
        Employee_1.SetEmployee_Name("John Doe");
        if (Employee_1.GetEmployee_ID() != 0) {

            System.out.println("The ID Of The Employee Is - " + Employee_1.GetEmployee_ID());
        } else {
            System.out
                    .println("The ID Of The Employee Is Not Set - Please Set The Employee ID Using The Setter Method");
        }
        System.out.println(Employee_1.GetEmployee_Name());
    }
}
