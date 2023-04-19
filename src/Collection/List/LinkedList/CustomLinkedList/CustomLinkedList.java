package Collection.List.LinkedList.CustomLinkedList;

import java.util.Iterator;

public class CustomLinkedList<Element> implements Iterable <Element>{
    private Node<Element> first;
    private Node<Element> last;

    public void add(Element element) {
        if (first == null) {
            Node<Element> node = new Node<>(element, null,null);
            first = node;
            last = node;
        } else {
            Node<Element> node = new Node<>(element, null, last);
            last.next = node;
            last = node;
        }
    }
    public void addFirst(Element element){
        Node<Element> node = new Node<>(element, first, null);
        if (first != null) {
            first.prev = node;
            first = node;
        } else {
            first = node;
            last = node;
        }
     }
    public void addLast(Element element) {
        Node<Element> node = new Node<>(element, null, last);
        if (last != null) {
            last.next = node;
            last = node;
        } else {
            first = node;
            last = node;
        }
    }
    public Element get(int index) {
        Node<Element> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.item;
    }

    public int size(){
        if (first != null) {
            Node<Element> result = first;
            int value = 1;
            while(result.next != null) {
                result = result.next;
                value++;
            }
            return value;
        } else {
            return 0;
        }
    }
    public void remove(int index) {
        Node<Element> obj = first;
        for (int i = 0; i < index; i++) {
            obj = obj.next;
        }
        if (obj == first && obj == last) {
            first = null;
            last = null;
        } else if (obj == first) {
            first = obj.next;
            first.prev = null;
        } else if (obj == last) {
            last = obj.prev;
            last.next = null;
        } else {
            obj.prev.next = obj.next;
            obj.next.prev = obj.prev;
        }
    }

    public Element getFirst(){
        return first.item;
    }
    public Element getLast(){
        return last.item;
    }

    @Override
    public Iterator<Element> iterator() {
        return new Iterator<Element>() {
            private Node<Element> current = first;
            @Override
            public boolean hasNext(){
                return current != null;
            }
            @Override
            public Element next(){
                Node<Element> tmp = current;
                current = current.next;
                return tmp.item;
            }
        };
    }
    private static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node (Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
