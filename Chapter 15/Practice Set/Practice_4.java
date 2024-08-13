import java.time.*;
import java.time.format.DateTimeFormatter;

public class Practice_4 {
    public static void main(String[] args) {
        LocalTime PresentTime = LocalTime.now();
        DateTimeFormatter MyFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String FormattedTime = PresentTime.format(MyFormatter);
        System.out.println(FormattedTime);
    }
}
