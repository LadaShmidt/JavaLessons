package Casting;

/*
 * Numeric Promotion в Java - это автоматическое преобразование типов для операций с числами.
 * Когда два значения разных типов участвуют в операции,
 * Java автоматически преобразует один или оба операнда в более широкий тип, чтобы выполнить операцию.
 *
 * Правила Numeric Promotion в Java следующие:
 * Если один операнд имеет тип double, то другой операнд преобразуется в тип double.
 * Если один операнд имеет тип float, а другой - double, то операнд типа float преобразуется в тип double.
 * Если один операнд имеет тип long, а другой - тип float или double, то операнд типа long преобразуется в тип float или double.
 * Если один операнд имеет тип int, а другой - тип long, float или double, то операнд типа int преобразуется в тип long, float или double.
 * Если один операнд имеет тип byte, short или char, а другой операнд имеет тип int, long, float или double, то операнд типа byte, short или char преобразуется в тип int перед выполнением операции.
 * Если оба операнда имеют одинаковый тип, то никаких преобразований не выполняется.
 *
*/

public class NumericPromotion {
    // Example 1:
    int i = 10;
    long l = 20;
    void example1() {
        // int будет преобразован в long
        System.out.println(i+l);
    }

    // Example 2:
    byte b = 100;
    float f = 7;
    double d = 2.0;
    void example2() {
        // Сначала byte будет сконвертирован в int, затем во float, затем в double
        System.out.println(b+f-d);
    }
}
