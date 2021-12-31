package datastructures;

import java.util.Arrays;

public class MyArray {

    int[] d = new int[1];
    int size = 0;

    public int[] sort() {
        Arrays.sort(d);
        return d;
    }

    public void add(Integer input){
        if (size >= d.length) {
            increaseSize();
        }
        d[size] = input;
        size++;
    }

    private void increaseSize() {
        d = Arrays.copyOf(d, 2*d.length);
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.println(Arrays.toString(d));
    }

    public static void main(String[] args) {
        MyArray a = new MyArray();
        a.add(5);
        a.add(1);
        a.add(20);
        a.add(2);
        a.add(15);
        a.print();
        a.sort();
        a.print();
        System.out.println(a.size);
    }
}
