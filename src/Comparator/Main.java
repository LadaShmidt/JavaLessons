package Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>(Arrays.asList(
                new Animal("Tiger","Bob",15),
                new Animal("Lion","Alex",10),
                new Animal("Dog","Masha",12)
        ));
        System.out.println("Before sort: \n" + animalList);
        Collections.sort(animalList, new NameComparator());
        System.out.println("After sort: \n" + animalList);
    }
}
