package OOP;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random randomWeight = new Random();
        // Создаем двух котов (объекты) с помощью конструктора
        Cat loriCat = new Cat();
        Cat baxterCat = new Cat();

        // С помощью сеттеров задаем имя и вес первому коту
        loriCat.setName("Lori");
        loriCat.setWeight(randomWeight.nextInt(10));

        // С помощью сеттера задаем имя и вес второму коту
        baxterCat.setName("Baxter");
        baxterCat.setWeight(randomWeight.nextInt(10));

        // Создаем Бойцовский клуб (объект)
        FightClub fightClub = new FightClub();

        // Сравниваем вес двух котов и выводим в консоль победителя
        System.out.println("Winner: " + fightClub.fight(loriCat, baxterCat));
    }
}
