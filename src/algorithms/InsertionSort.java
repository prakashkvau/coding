package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSort {
    public List<Integer> sort(List<Integer> input) {
        int size = input.size();
        for (int i = 1; i < size ; i++) {
           // check and insert
            for (int j = 0; j < i;j++) {
                if (input.get(j) > input.get(i)) {
                    Collections.swap(input, j, i);
                }
            }
        }

        return input;
    }

    public static void main(String[] args) {
        List<Integer> i = new ArrayList<Integer>();
        i.add(2);
        i.add(1);
        i.add(3);
        i.add(-1);
        i.add(-100);
        InsertionSort bs = new InsertionSort();
        List<Integer> sl = bs.sort(i);
        for (Integer temp : sl) {
            System.out.println(temp);
        }
    }
}
