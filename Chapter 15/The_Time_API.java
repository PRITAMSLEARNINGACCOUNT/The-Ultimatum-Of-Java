import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class The_Time_API {
    public static void main(String[] args) {
        LocalDate Date = LocalDate.now();
        System.out.println("The Current Date Is - " + Date);
        LocalTime Time = LocalTime.now();
        System.out.println("The Current Time Is - " + Time);
        LocalDateTime DateTime = LocalDateTime.now();
        String DateTimeString = DateTime.toString();
        for (String SplittedString : DateTimeString.split("T")) {
            System.out.println(SplittedString);
        }
        System.out.println("The Current Date And Time Is - " + DateTime);
        System.out.println("Now Formatting Date & Time According To The My Way");
        DateTimeFormatter MyFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String FormattedDateTime = DateTime.format(MyFormatter);
        String FormattedDate = Date.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Here Is The Formatted Date And Time - " + FormattedDateTime);
        System.out.println("Only Formatted Date (ISO-Date) - " + FormattedDate);

    }
}
