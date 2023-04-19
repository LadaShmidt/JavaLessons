package NestedClasses.Anonymous;
/*
    Anonymous class не имеет имени.
    Anonymous class может как импелментировать интерфейсы, так и наследоваться от других классов.
    Anonymous class это объявление класса и одновременное создание объекта.
    В anonymous class невозможно написать конструктор.
    Anonymous class может обращаться даже к private элементам внешнего класса.
    Lambda expressions краткая форма для написания анонимных классов. 
*/
public class Car {
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
    }
    interface Math {
        int doOperation(int a, int b);
    }
}
