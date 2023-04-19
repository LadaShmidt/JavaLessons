package Comparator;
import java.util.Comparator;

public class NameComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal first, Animal second) {
        return first.name.compareTo(second.name);
    }
}
