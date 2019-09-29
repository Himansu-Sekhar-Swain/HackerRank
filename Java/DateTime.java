
import java.time.LocalDate;

class DateTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        String[] days = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNSEDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        LocalDate ld = LocalDate.of(year, month, day);
        return ld.getDayOfWeek().toString();
    }
}
