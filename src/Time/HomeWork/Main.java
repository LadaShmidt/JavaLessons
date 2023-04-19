package Time.HomeWork;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDateTime firstTime = LocalDateTime.of(2022,1,15,20,0);
        LocalDateTime secondTime = LocalDateTime.of(2022,12,15,20,0);
        Period period = Period.ofMonths(1);
        Duration duration = Duration.ofHours(2);
        Time time = new Time();

        time.change(firstTime,secondTime, period, duration);
    }
}
