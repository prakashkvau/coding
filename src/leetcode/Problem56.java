package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) return res.toArray(new int[0][]);

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals) {
            if(i[0] <= end) {
                end = Math.max(end, i[1]);
            }
            else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        Problem56 s = new Problem56();
        int[][] data = new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}};
//        int[][] data = new int[][]{{1,4},{4,8}};
        int[][] ret = s.merge(data);
        for (int[] i : ret) {
            System.out.println(Arrays.toString(i));
        }
    }
}
