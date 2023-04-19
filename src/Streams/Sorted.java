package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
    Метод sorted используется для сортировки элементов в коллекции.
    Он может быть использован для сортировки массивов или списков любых объектов,
    которые реализуют интерфейс Comparable или имеют свойство Comparator.
*/

public class Sorted {
    class Student {
        String name;
        int age;
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString(){
            return name + " " + age;
        }
    }
    public void main(String[] args) {
        int[] array = {3,9,2,5,7,8};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        Student st1 = new Student("Petr", 22);
        Student st2 = new Student("Maria", 25);
        Student st3 = new Student("Oleg", 33);
        Student st4 = new Student("Anna", 15);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);

        studentList = studentList.stream().sorted((x,y) -> x.name.compareTo(y.name)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
