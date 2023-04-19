package Generic.Game;

public abstract class Participant {
    private String name;
    private int age;
    Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
