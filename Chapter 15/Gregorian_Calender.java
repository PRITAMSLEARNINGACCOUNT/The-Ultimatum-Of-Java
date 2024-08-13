import java.util.Calendar;
import java.util.TimeZone;

public class Gregorian_Calender {
    public static void main(String[] args) {
        Calendar MyCalender = Calendar.getInstance();
        System.out.println("The Current Time Is - ");
        System.out.println(MyCalender.getTime());
        System.out.println("The Current Time Zone Is - " + MyCalender.getTimeZone());
        System.out.println("The Type Of The Calender Is - " + MyCalender.getCalendarType());
        System.out.println("A Railway (24 Hour Format) Clock Is - ");
        System.out.println(MyCalender.get(Calendar.HOUR_OF_DAY) + ":" + MyCalender.get(Calendar.MINUTE) + ":"
                + MyCalender.get(Calendar.SECOND));
        System.out.println("A Normal 12 Hour Format Clock - ");
        System.out.println(MyCalender.get(Calendar.HOUR) + ":" + MyCalender.get(Calendar.MINUTE) + ":"
                + MyCalender.get(Calendar.SECOND));
        System.out.println("The Available IDs For Time Zones Are - ");
        String[] TimeZoneIDs = TimeZone.getAvailableIDs();
        for (String EachID : TimeZoneIDs) {
            System.out.println(EachID);
        }
    }
}
