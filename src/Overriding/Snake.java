package Overriding;

public class Snake extends Animal {
    @Override
    public void moving() {
        System.out.println("Snake crawling");
    }
    public static void amountTail () {
        System.out.println("No tail");
    }
}
