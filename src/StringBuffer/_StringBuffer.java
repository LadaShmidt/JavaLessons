package StringBuffer;
/*
 * Классы StringBuffer и StringBuilder в Java используются, когда возникает необходимость сделать много изменений в строке символов.
 * В отличие от строк, объекты типа StringBuffer и StringBuilder могут быть изменены снова и снова, оставляя после себя множество новых неиспользуемых объектов.
 * Основное различие между StringBuffer и StringBuilder является то, что методы StringBuilder не являются безопасными для потоков (несинхронизированные).
 * Рекомендуется использовать StringBuilder всякий раз, когда это возможно, потому что он быстрее, чем StringBuffer в Java.
 * Однако, если необходима безопасность потоков, наилучшим вариантом являются объекты StringBuffer.
 */
public class _StringBuffer {
    public static void main(String[] args) {
        // Пример объявления и инициализации переменной типа StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("StringBuffer: " + stringBuffer);

        // Пример инициализации переменной типа StringBuilder
        StringBuilder stringBuilder = new StringBuilder ("Hello");

        // Далее рассмотрим некоторые методы класса StringBuffer

        // Метод append() - добавляет заданный аргумент в конец строки.
        stringBuffer.append("Bye");
        System.out.println("append(Bye): " + stringBuffer);

        // Метод insert - вставляет заданный аргумент в указанную позицию внутри строки.
        stringBuffer.insert(5, "Red");
        System.out.println("insert(5, Red): " + stringBuffer);

        // Метод delete() - удаляет символы в заданном диапазоне индексов.
        stringBuffer.delete(8,11);
        System.out.println("delete(8,11): " + stringBuffer);

        // Метод reverse() - меняет порядок символов в строке на обратный.
        stringBuffer.reverse();
        System.out.println("reverse(): " + stringBuffer);

        // Метод replace() - заменяет заданный диапазон символов новой строкой.
        stringBuffer.replace(0,8, "HelloRed");
        System.out.println("replace(0, 8, HelloRed): " + stringBuffer);

        // Метод length() - возвращает длинну строки
        System.out.println("length(): " + stringBuffer.length());

        // Метод charAt() - возвращает элемент в указанном индексе
        System.out.println("charAt(5): " + stringBuffer.charAt(5));

        // Метод setCharAt() - заменяет символ в указанном индексе
        stringBuffer.setCharAt(5, 'B');
        System.out.println("setCharAt(5, B): " + stringBuffer);

        // Метод capacity() - возвращает количество символов, для которых зарезервирована память, по умолчанию - 16 запасных символов
        System.out.println("capacity: " + stringBuffer.capacity());

        // Метод indexOf() - возвращает индекс, под которым символ или строка первый раз появляются в строке, возвращает -1 если строка или символ не найдены
        System.out.println("indexOf" + stringBuffer.indexOf("B"));
    }
}
