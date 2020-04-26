package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PerfectSquares {
    public int numSquares(int n) {
        List<Integer> sqrs = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            long sqr = i * i;
            if (n < sqr) {
                break;
            }
            sqrs.add((int) sqr);
        }

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(n);
        q.offer(null);
        int depth = 0;
        while (!q.isEmpty()) {
            if (null == q.peek()) {
                q.poll(); // remove null
                depth++;
                q.offer(null); // add null
            }
            int num = q.poll();
            for (Integer sqr : sqrs) {
                int sN = num - sqr;
                if (sN == 0) {
                    return ++depth;
                } else if (sN < 0) {
                    break;
                } else {
                    q.offer(sN);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        PerfectSquares p = new PerfectSquares();
        System.out.println(p.numSquares(7));
    }
}
