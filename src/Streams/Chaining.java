package Streams;
import java.util.Arrays;
/*
    Метод chaining (или цепочный вызов методов) - это прием программирования,
    который позволяет вызывать несколько методов объекта последовательно,
    используя точку для разделения вызовов.
    Это удобно для написания более компактного и читаемого кода,
    так как позволяет объединить несколько операций в одной строке.
*/
public class Chaining {
    public static void main(String[] args) {
        int[] array = {3,5,7,4,5,7,8,9,21,6};
/*
        Создадим поток из массива, отфильтруем stream таким образом, чтобы в нем остались только четные числа.
        Затем поделим на 3 только те числа, которые делятся без остатка и найдем сумму оставшихся чисел.
*/
        int sum = Arrays.stream(array).filter(element -> element % 2 == 0).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).reduce((accumulator, element) -> accumulator + element).orElse(0);

        System.out.println(sum);
    }
}
/*
    Работа метода chaining в stream:

    Source (коллекции или массивы) ----> Intermediate methods (lazy) ----> Terminal methods (eager).

    У нас есть Source коллекций или массивов, мы создаем из них stream и используя элементы stream в методах,
    которые называются intermediate methods (промежуточные методы), в конечном итоге элементы поступают
    в Terminal methods (eager).

    Intermediate methods - принимают и возвращают потоки.
    1. map();
    2. filter();
    3. sorted();
    4. distinct();
    5. peek();
    6. flatMap();
    7. limit();
    8. skip();
    9. mapToInt();

    Terminal methods - принимают, но не возвращают потоки.
    1. forEach();
    2. reduce();
    3. count();
    4. collect();
    5. findFirst();
    6. min();
    7. max();
    Промежуточные intermediate methods не работают до тех пор, пока не будет вызван Terminal method.
*/