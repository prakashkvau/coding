package datastructures;

public class MyLinkedList {
    LinkedList head;

    class LinkedList {
        int data;
        LinkedList next;

        LinkedList(int data) {
            this.data = data;
        }

        LinkedList() {

        }
    }

    public void add(int i) {
        LinkedList nl = new LinkedList(i);
        if (head == null) {
            head = nl;
        } else {
            nl.next = head;
            head = nl;
        }
    }

    public static void main(String[] args) {
        MyLinkedList m = new MyLinkedList();
        m.add(4);
        m.add(2);
    }
}
