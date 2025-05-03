import java.sql.*;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        try {
            System.out.println("Connecting To JDBC With PostgreSQL");
            Connection MyConnection = DriverManager.getConnection("jdbc:postgresql://ep-little-poetry-a4lnpuyn-pooler.us-east-1.aws.neon.tech/neondb", "neondb_owner", "npg_ERfnV20dFePM");
            Statement MyStatement = MyConnection.createStatement();
            try {
                System.out.println("Creating Employee Table");
                int MyQueryResult = MyStatement.executeUpdate("CREATE TABLE Employee (EmpID\n" +
                        "INTEGER\n" +
                        "PRIMARY KEY\n" +
                        "GENERATED ALWAYS AS IDENTITY,EmployeeName VARCHAR,EmployeeSalary INT,EmployeeProfession VARCHAR)");
                System.out.println(MyQueryResult);

            } catch (SQLException E) {
                System.out.println("Table Already Exists");

            } finally {
                try {

                    System.out.println("Insertion Into Employee Table");
                    Scanner MyScanner = new Scanner(System.in);
                    System.out.println("Enter The Name Of The Employee");
                    String EmployeeName = MyScanner.nextLine();
                    System.out.println("Enter The Salary Of An Employee");
                    int EmployeeSalary = MyScanner.nextInt();
                    System.out.println("Enter The Profession Of An Employee");
                    String EmployeeProfession = MyScanner.next();
                    System.out.println("So The Name Of The Employee Is - " + EmployeeName + " Having " + EmployeeSalary + " Per Month Salary In The " + EmployeeProfession + " Profession");
                    String MyString = String.format("INSERT INTO Employee (EmployeeName,EmployeeSalary,EmployeeProfession) VALUES ('%s',%d,'%s')", EmployeeName, EmployeeSalary, EmployeeProfession);
                    int MyResult = MyStatement.executeUpdate(MyString);
                    if (MyResult == 1) {
                        System.out.println("Record Inserted Successfully");
                    }
                    else{
                        System.out.println("Failed To Insert The Record Into The Table");
                    }
                } catch (SQLException ValueInsertionException) {
                    ValueInsertionException.printStackTrace();
                }
            }
            MyConnection.close();
        } catch (Exception MyException) {
            MyException.printStackTrace();
        }

    }
}
