package Collection.List.LinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();

        customLinkedList.addFirst("123");

        for (String element: customLinkedList) {
            System.out.println(element);
        }
    }
}
