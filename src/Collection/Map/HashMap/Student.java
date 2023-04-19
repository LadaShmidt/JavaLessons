package Collection.Map.HashMap;
import java.util.Objects;
/*
    HashMap это класс, который реализует интерфейс Map и используется для хранения пар ключ-значение
    в виде хеш-таблицы. В HashMap ключи хешируются для быстрого доступа к соответствующим значениям.
    Этот класс не гарантирует порядок элементов при итерации по ключам или значениям.

    В основе HashMap лежит массив. Элементами данного массива являются структуры LinkedList.
    Данные структуры и заполняются элементами, которые мы добавляем в HashMap.

    Добавление элементов в HashMap происходит следующим образом:

    1. Вычисляется hashCode() ключа элемента.

    2. Вычисляется индекс в массиве, где элемент будет храниться, используя вычисленное значение hashCode() и размер массива.

    3. Если индекс массива уже занят другим элементом, то происходит проверка на равенство ключей,
    если ключи равны, то значение элемента обновляется, если ключи различны, то элемент добавляется в связанный список, который находится в этом индексе массива.

    При поиске элемента в HashMap, сначала вычисляется hashCode() и находится соответствующий индекс массива.
    Затем происходит поиск в цепочке связанных списков, чтобы найти элемент с нужным ключом.

    Классы и поля классов, которые являются ключами HashMap рекомендуется делать константными,
    иначе меняя поля класса, мы меняем HashCode объекта и найти измененный объект в HashMap будет невозможно по его имени.

    В худшем случае, время поиска элемента в HashMap в BigO notation равно O(n), где n - это количество элементов в HashMap.
    Однако, при правильной настройке хэш-функции и решении коллизий, время поиска элемента в HashMap в среднем составляет O(1),
    т.е. постоянное время. Это делает поиск элемента в HashMap очень эффективным для большинства случаев использования.
*/
public final class Student {
    final String name;
    final String surname;
    final int course;

    Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    // Для корректного сравнения объектов внутри HashMap необходимо переопределять оба метода equals() и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
