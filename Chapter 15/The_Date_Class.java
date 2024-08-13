import java.util.Date;

public class The_Date_Class {
    public static void main(String[] args) {
        Date MyDate = new Date();
        System.out.println("Current Date Is - " + MyDate);
        System.out.println("Time(Miliseconds) From January 1, 1970 To Current MiliSecond Is - " + MyDate.getTime());
    }
}