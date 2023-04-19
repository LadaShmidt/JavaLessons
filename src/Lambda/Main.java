package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static Lambda.Student.*;
public class Main {
    public static void main(String[] args) {
        // var - local variable type inference
        var studentArrayList = new ArrayList<>(Arrays.asList(
                new Student("Alex", 5,17),
                new Student("Oleg", 10,15),
                new Student("Masha", 4,25),
                new Student("Bob", 8,30)
        ));

          // Выводим в консоль всех студентов чья оценка больше 6
          studentCheck(studentArrayList, (Student student) -> {
              // Реализация метода функционального интерфейса
              return student.getGrade() > 6;
          });

          // Сокращенный вариант записи лямбда выражения без указания типа данных
          studentCheck(studentArrayList, student -> student.getAge() > 18);

          /*
            В лямбда выражении справа от оператора стрелка находится тело метода,
            которое было бы у метода соответствующего класса,
            имплементировавшего наш интерфейс с единственным методом.
          */

        // Можно поместить лямбда выражение в переменную для неоднократного дальнейшего использования
        StudentInterface studentInterface = (Student student) -> {
            return student.getGrade() < 6;
        };
        studentCheck(studentArrayList, studentInterface);

        // Способ перезаписать метод интерфейса Comparator
        Collections.sort(studentArrayList, (firstStudent, secondStudent) -> firstStudent.getAge()-secondStudent.getAge());


    }

}
