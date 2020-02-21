package datastructures;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> li = new LinkedList<Integer>();

    public void push(int i) {
        li.addLast(i);
    }

    public int pop() {
        int val = li.getFirst();
        li.removeFirst();
        return val;
    }

    public int top() {
        return li.getFirst();
    }

    public int size() {
        return li.size();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(5);
        myQueue.push(-1);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.top());

        System.out.println(myQueue.size());
    }
}
