package Constructions;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Введите  номер дня недели");
        Scanner input = new Scanner(System.in);
        int dayNumber = input.nextInt();

        printDayofWeek(dayNumber);
    }

    public static void printDayofWeek(int dayNumber) {
        switch(dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
    }
}
