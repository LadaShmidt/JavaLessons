package Interface;
import Interface.LunchInterface.*;
import Interface.SportInterface.*;

// Абстрактный класс Driver реализует лишь по 1/2 методов интерфейсов которые он имплементирует
public abstract class Driver extends Employee implements Lunch, Sport{
    @Override
    public void eat(){
        System.out.println("Teacher eat for " + cost + " dollars");
    }
    @Override
    public void run() {
        System.out.println("Teacher run");
    }
    @Override
    public void smoke(){
        System.out.println("Driver smokes");
    }

}
