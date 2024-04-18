package Iterator;

import java.util.NoSuchElementException;

public class List <T>{
    private Node<T> head;
    private int size;
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    public  void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }
    public  Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node<T> curr = head;
        @Override
        public boolean hasNext() {
            return curr.next != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T data = curr.data;
                curr = curr.next;
                return data;
            } else {
                throw new NoSuchElementException();
            }
        }
    }


}
