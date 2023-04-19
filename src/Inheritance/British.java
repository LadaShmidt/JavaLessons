package Inheritance;

public class British extends Cat {
    private String name;
    public British (String name, int age, String owner) {
        super(age, owner);
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // @Override - аннотация, означает что метод переопределяется
    @Override
    public String toString() {
        // С помощью ключевого слова super мы обращаемся к родителю(суперклассу)
        // Но указывать ключевое слово super при вызове метода суперкласса необязательно
        // Так как все дочерние классы суперкласса и так видят все его методы и поля
        // И можем использовать и переназначать его методы
        // return super.toString();
        return "Cat " + name + " Age " + getAge() + " Owner " + getOwner();
    }
}
