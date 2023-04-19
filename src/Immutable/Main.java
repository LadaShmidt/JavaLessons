package Immutable;
// Сущесвтует такое понятие как неизменяемые (immutable) объекты, которые не меняют свое внутреннее состояние
public class Main {
    public static void main(String[] args) {
        // Объект типа String является immutable и для склеивания строк в нём, нам необъодимо создать новый объект
        String s1 = "Hello ";
        String s2 = s1.concat("World!");
        System.out.println(s2);

        // Объект типа StringBuilder является mutable и его методами можно склеить строки не создавая новый объект
        StringBuilder sb1 = new StringBuilder("Hello ");
        sb1.append("World");
        sb1.append("!");
        System.out.println(sb1);

        // Объект типа StringBuffer является mutable и его методами можно склеить строки не создавая новый объект
        StringBuffer sb2 = new StringBuffer ("Hello ");
        sb2.append("World");
        sb2.append("!");
        System.out.println(sb2);

        // Отличие StringBuilder от StringBuffer в том, что все методы StringBuffer являются синхронизироваными

        /*
         * Класс StringBuffer имеет методы с модификатором synchronized и используется при многопоточности и работает медленнее
         * Поэтому если с объектом не собираются взаимодействовать множество потоков, оптимально будет использовать класс StringBuilder, он будет работать быстрее
         */

        Owner alex = new Owner("Alex");
        Cat lori = new Cat("Lori",5, alex);
    }
}
