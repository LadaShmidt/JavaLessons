package Collection.List.Stack;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob",20, 1);
        Student st2 = new Student("Bill", 16, 2);
        Student st3 = new Student("Maria", 22, 3);

        Stack<Student> stack = new Stack<>();
        // Метод push() - добавляет элемент вверх списка
        stack.push(st1);
        stack.push(st2);
        stack.push(st3);
        // Метод peek() - находит последний элемент списка
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            //  Метод pop() - находит и удаляет последний элемент списка
            stack.pop();
        }
    }
}
