package Lambda.Function;
import java.util.ArrayList;
import static Lambda.Function.Student.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student st1 = new Student("Igor", 5.4);
        Student st2 = new Student("Masha", 2.8);
        Student st3 = new Student("Max", 8.3);

        students.add(st1);
        students.add(st2);
        students.add(st3);

        double result = avgOfSmth(students, student -> student.getAvgGrade());
        System.out.println(result);
    }
}
