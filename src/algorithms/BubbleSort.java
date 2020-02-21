package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Integer> sort(List<Integer> input) {
        int size = input.size();
        for (int i = size -1  ; i > 0; i--) {
            Integer j = i;
            while(j > 0) {
                if (input.get(j) < input.get(j-1)) {
                    Collections.swap(input, j, j - 1);
                }
                j--;
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

        BubbleSort bs = new BubbleSort();
        List<Integer> sl = bs.sort(i);
        for (Integer temp : sl) {
            System.out.println(temp);
        }
    }
}
