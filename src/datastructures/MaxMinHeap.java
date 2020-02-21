package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinHeap {

    List<Integer> list = new ArrayList<>();

    public void insert(int i) {
        // add to end of list
        list.add(i);
        int j = list.indexOf(i);


        // propagate to top
        while (j > 0) {
            if (list.get((j - 1) / 2) < list.get(j)) {
                Collections.swap(list, j, (j - 1) / 2);
            }
            j = (j - 1) / 2;
        }
    }

    // 'i' is node
    public void heapify(int i) {
        int curr = list.get(i);
        int left = list.get(2*i + 1);
        int right = list.get(2*i + 2);

        if (curr < left) {

        } else if (curr < right) {

        } else {
            return;
        }

        heapify(i);
    }

    public void print() {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MaxMinHeap myMinHeap = new MaxMinHeap();
        myMinHeap.insert(5);
        myMinHeap.insert(10);
        myMinHeap.insert(15);
        myMinHeap.print();
    }

}
