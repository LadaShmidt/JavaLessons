package Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static Time.ChangeOfSeasons.*;
public class Main {
    public static void main(String[] args) {
        // В Java для работы с датами и временем есть несколько классов:
        LocalDate.now();
        LocalTime.now();
        LocalDateTime.now();

        // С помощью метда of() мы можем создавать переменные которые ссылаются на новый объект с нужными значениями
        LocalDate localDate = LocalDate.of(2017,10,18);

        LocalTime localTime = LocalTime.of(20,10,00);

        LocalDateTime localDateTime = LocalDateTime.of(2022,10,5,2,45);

        // Методы данных классов являются immutable

        // Методы класса LocalDate
        localDate.plusDays(5);
        localDate.minusDays(2);

        localDate.plusWeeks(2);
        localDate.minusWeeks(1);

        localDate.plusMonths(3);
        localDate.minusMonths(3);

        localDate.plusYears(5);
        localDate.minusYears(4);

        // Методы класса LocalTime
        localTime.plusNanos(100);
        localTime.minusNanos(150);

        localTime.plusSeconds(2);
        localTime.minusSeconds(1);

        localTime.plusMinutes(3);
        localTime.minusMinutes(0);

        localTime.plusHours(5);
        localTime.minusHours(2);

        // Методы проверки какая дата была раньше или позже:
        boolean isAfter = localTime.isAfter(LocalTime.now());
        boolean isBefore = localTime.isBefore(LocalTime.now());

        LocalDate start = LocalDate.of(2022,12,1);
        LocalDate end = LocalDate.of(2023,9,2);
        Period period = Period.ofMonths(3);
        changeOfSeasons(start, end, period);

        // Методы которые возвращают день
        System.out.println("День недели: " + start.getDayOfWeek());
        System.out.println("День месяца: " + start.getDayOfMonth());
        System.out.println("День года: " + start.getDayOfYear());

        // Методы которые возвращают час, минуты, секунды и наносекунды
        System.out.println("Часов: " + localTime.getHour());
        System.out.println("Минут: " + localTime.getMinute());
        System.out.println("Секунд: " + localTime.getSecond());
        System.out.println("Наносекунд: " + localTime.getNano());

        // Изменение формата даты:
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(localDateTime.format(dateTimeFormatter1));

        // Создание своего формата даты:
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd MMMM, yyyy, hh:mm");
        System.out.println(localDateTime.format(dateTimeFormatter2));

        // Преведение типов
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = LocalDate.parse("18 01 1993", dateTimeFormatter3);
    }
}
