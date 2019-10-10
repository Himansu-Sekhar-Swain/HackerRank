import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {

    public static void main(String [] arg) {

        System.out.println("Current Date : "+LocalDate.now());
        System.out.println("Current Time : "+LocalTime.now());
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted >> "+current.format(dateTimeFormatter));

    }
}
