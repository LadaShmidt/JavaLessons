package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Создать объект который наследует (British и Scottish), можно при помощи родителя (Cat)
        British lori = new British("Lori",3, "Ivan");
        Scottish baxter = new Scottish("Baxter", 5, "Igor");

        lori.sayMeow();
        baxter.sayMeow();

        System.out.println("Name: " + lori.getName() + " Age: " + lori.getAge() + " Owner: " + lori.getOwner());
        System.out.println("Name: " + baxter.getName() + " Age: " + baxter.getAge() + " Owner: " + baxter.getOwner());

        // Метод toString принадлежит классу Object, который является суперклассом всех объектов
        System.out.println(lori.toString());
        System.out.println(baxter.toString());

        // Создадим два объекта типа Scottish с одинаковыми значениями полей
        Scottish martin = new Scottish("Martin",4, "Oleg");
        Scottish anotherMartin = new Scottish("Martin",4, "Oleg");

        // Создадим два объекта типа British с одинаковыми значениями полей
        British elizabeth = new British("Elizabeth",6, "Max");
        British anotherElizabeth = new British("Elizabeth",6, "Max");

        // Сравним два одинаковых объекта с помощью оператора сравнения ==
        // И получим false, так как оператор сравнения сравнивает не объекты, а ссылки на них
        System.out.println(martin == anotherMartin);

        // Сравним два одинаковых объекта с помощью метода equals()
        // Получим false, так как метод equals() также сравнивает между собой ссылки
        System.out.println(elizabeth.equals(anotherElizabeth));

        // Получим true, так как мы перезаписали метод equals() в классе Scottish
        // И он сравнивает между собой значения полей объектов
        System.out.println(martin.equals(anotherMartin));


    }
}
