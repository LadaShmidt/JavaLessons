package Interface;

public class SportInterface {
    interface Sport{
        int number = 5;
        void run();
        void jump();

         /*
          * Статический метод не будет унаследован из интерфейса в класс.
          * Все статик методы по умолчанию имеют access modifier public.
          * Static methods не наследуются ни одним классом который их имплементирует.
          * Для вызова static method необходимо использовать имя интерфейса.
          */
        static void football () {
            System.out.println("footbal");
        }

        /*
        * Начиная с java 9 в интерфейсы были добавлены private methods
        * Private method в интерфейсах обязательно должен иметь тело
        * Private method не может быть abstract
        * Private method может быть использован только внутри интерфейса
        * Private method может быть использован внтури static и non-static методов внутри одного класса
        */
        private static void basketball() {
            System.out.println("basketball");
        }
    }
}
