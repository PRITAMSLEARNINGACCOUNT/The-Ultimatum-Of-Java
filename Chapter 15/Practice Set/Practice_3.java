import java.util.Calendar;

public class Practice_3 {
    public static void main(String[] args) {
        Calendar MyCalender = Calendar.getInstance();
        System.out.println(MyCalender.get(Calendar.HOUR_OF_DAY) + ":" + MyCalender.get(Calendar.MINUTE) + ":" + MyCalender.get(Calendar.SECOND));
    }
}
