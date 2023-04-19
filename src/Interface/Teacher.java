package Interface;
import Interface.LunchInterface.*;
import Interface.SportInterface.*;
public class Teacher extends Employee implements Lunch, Sport {
    /*
    * Если оба имплементрируемых интерфейса имеют константы с одинаковыми именами,
    * Для их вызова необходимо обращаться к ним по имени их интерфейса
    */
    public void method() {
        System.out.println(Sport.number);
    }
    @Override
    public void eat(){
        System.out.println("Teacher eat for " + cost + " dollars");
    }
    @Override
    public void drink() {
        System.out.println("Teacher drink for " + cost + " dollars");
    }
    @Override
    public void run() {
        System.out.println("Teacher run");
    }
    @Override
    public void jump(){
        System.out.println("Teacher jump");
    }
}
