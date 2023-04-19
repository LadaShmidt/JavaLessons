package Lambda;
import java.util.ArrayList;
/*
   Lambda-выражения - это синтаксическая конструкция, которая позволяет передавать
   функции в качестве параметров других функций, а также создавать анонимные функции.
 */
public class Student {
    private String name;
    private double grade;
    private Integer age;

    public Student(String name, double grade, Integer age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    // Перезаписываем метод toString для корректного вывода полей объектов в консоль
    @Override
    public String toString() {
        return "Name: " + name + ", grade: " + grade + ", age: " + age;
    }

    public static void studentCheck(ArrayList<Student> studentArrayList, StudentInterface studentInterface) {
        studentArrayList.forEach(student -> {
            // Если метод функционального интерфейса вернет true
            if (studentInterface.studentMethod(student)) {
                // Тогда мы выполним это тело
                System.out.println(student);
            }
        });
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
