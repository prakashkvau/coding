package datastructures;

import java.util.LinkedList;

public class MyStack {
    LinkedList<Integer> li = new LinkedList<Integer>();

    public void push(int i) {
        li.addFirst(i);
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
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(10);
        myStack.push(-1);

        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
    }
}
