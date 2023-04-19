package Time;
import java.time.*;

public class ChangeOfSeasons {
    private static LocalDate january = LocalDate.of(2022,1,1);
    private static LocalDate march = LocalDate.of(2022,3,1);
    private static LocalDate jule = LocalDate.of(2022,6,1);
    private static LocalDate september = LocalDate.of(2022,9,1);
    public static void changeOfSeasons(LocalDate start, LocalDate end, Period period) {
        LocalDate date = start;
        while(date.isBefore(end)) {
            if (date.isAfter(january)) {
                System.out.println(date + " Наступила зима");
                date = date.plus(period);
            }
            if (date.isAfter(march)) {
                System.out.println(date + " Наступила весна");
                date = date.plus(period);
            }
            if (date.isAfter(jule)) {
                System.out.println(date + " Наступило лето");
                date = date.plus(period);
            }
            if (date.isAfter(september)) {
                System.out.println(date + " Наступила осень");
                date = date.plus(period);
            }
        }
    }
}
