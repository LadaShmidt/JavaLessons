package Polymorphism;

public class Main {
    public static void main(String[] args) {
       Cat lori = new Cat();
       Dog bublik = new Dog();

        lori.say();
        bublik.say();

        findOwner(lori);
        findOwner(bublik);

        System.out.println("Lori's owner: " + lori.getOwner());
        System.out.println("Bublik's owner: " + bublik.getOwner());
    }
    private static void findOwner(Animal animal) {
        if (animal.getClass() == Cat.class) {
            animal.setOwner("Boris");
        }
        if (animal.getClass() == Dog.class) {
            animal.setOwner("Ivan");
        }
    }
}
