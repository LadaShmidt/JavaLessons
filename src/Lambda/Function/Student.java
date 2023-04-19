package Lambda.Function;
import java.util.ArrayList;
import java.util.function.Function;
/*
    Интерфейс Function представляет функциональный интерфейс, который принимает один аргумент и возвращает результат.

    Интерфейс Function может использоваться для определения любой функции,
    которая принимает один аргумент и возвращает результат любого типа данных.
*/
public class Student {
    private String name;
    private double avgGrade;
    Student(String name, double avgGrade) {
        this.name = name;
        this.avgGrade = avgGrade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
    // Пример нахождения средней арифметической оценки студентов с помощью интерфейса Student
    public static double avgOfSmth(ArrayList<Student> students, Function<Student, Double> function) {
        double result = 0;
        for(Student student: students) {
            result += function.apply(student);
        }
        result = result / students.size();
        return result;
    }
}
