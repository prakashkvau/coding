package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort {
    public List<Integer> sort(List<Integer> input) {
        int size = input.size();
        for (int i = 0; i < size; i++) {
            // select min value and swap with i
            int min = i;
            for (int j = i; j < size; j++) {
                if (input.get(j) < input.get(min)) {
                    min = j;
                }
            }

            Collections.swap(input, i, min);

        }

        return input;
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        List<Integer> data = new ArrayList<>();
        data.add(-1);
        data.add(2);
        data.add(4);
        data.add(3);
        data.add(-10);
        List<Integer> res = ss.sort(data);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
