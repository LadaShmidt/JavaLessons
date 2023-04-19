package Collection.List.LinkedList;
/*
   LinkedList (двухсязный список) в Java представляет собой структуру данных, которая состоит из узлов,
   Связанных друг с другом в однонаправленную или двунаправленную последовательность.
   Каждый узел содержит данные и ссылку на следующий или предыдущий узел в списке.

   Когда использовать LinkedList:
   Необходимо много данных добавлять в начало списка
   Удалять с начала (index = 0) списка, т.е. элементы, которые были добавлены первыми.
   set в конце списка

   Для LinkedList, доступ к элементу по индексу и значению требует перебора элементов в цикле,
   поэтому это может занять линейное время O(n), где n - количество элементов в списке.
 */
public class Student {
    String name;
    int age;
    int course;

    Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + course;
    }
}
