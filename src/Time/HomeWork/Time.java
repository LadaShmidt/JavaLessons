package Time.HomeWork;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Time {
    DateTimeFormatter firstFormat = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter secondFormat = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public void change(LocalDateTime start, LocalDateTime end, Period period, Duration  duration) {
        LocalDateTime dateAndTime = start;
        while(dateAndTime.isBefore(end)) {
            System.out.println();
            System.out.print("Работаем с " + dateAndTime.format(firstFormat));
            dateAndTime = dateAndTime.plus(period);
            System.out.println("До: " + dateAndTime.format(firstFormat));
            System.out.println();
            System.out.println("Отдыхаем с: " + dateAndTime.format(secondFormat));
            dateAndTime = dateAndTime.plus(duration);
            System.out.println("До: " + dateAndTime.format(secondFormat));
        }
    }
}
