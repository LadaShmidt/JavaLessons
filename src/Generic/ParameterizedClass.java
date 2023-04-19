package Generic;
/*
 * В языке программирования Java ключевое слово "generic" используется для создания обобщённых классов,
 * Методов и интерфейсов, которые могут работать с разными типами данных.
 * Обобщённые типы позволяют создавать классы и методы, которые могут быть переиспользованы для разных типов данных
 * Без необходимости написания отдельных версий для каждого типа.
 */

// <T> - Type place holder, заглушка, которая в дальнейшем будет заменена на существующий ссылочный тип данных
public class ParameterizedClass<T> {
    public T element;
    ParameterizedClass(T element) {
        this.element = element;
    }
    @Override
    public String toString(){
        return "(" + element + ")";
    }
}