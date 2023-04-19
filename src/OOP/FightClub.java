package OOP;

public class FightClub {
    // Создаем функцию fight в классе FightClub которая сравнивает вес котов
    public String fight (Cat firstCat, Cat secondCat) {
        String draw = "Ничья!";
        if (firstCat.getWeight() > secondCat.getWeight()) {
            return firstCat.getName();
        } else if (firstCat.getWeight() < secondCat.getWeight()) {
            return secondCat.getName();
        } else {
            return draw;
        }
    }
}
