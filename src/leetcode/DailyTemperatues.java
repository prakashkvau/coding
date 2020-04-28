package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatues {
    public int[] dailyTemperatures(int[] T) {
        // 73,74,75,71,69
        int[] ans = new int[T.length];
        Stack<Integer> s = new Stack<>();
        for (int i = T.length-1; i >= 0; --i) {
            while (!s.empty() && T[i] >= T[s.peek()])
                s.pop();
            ans[i] = s.empty() ? 0 : s.peek() - i; 
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        DailyTemperatues dt = new DailyTemperatues();
        System.out.println(Arrays.toString(dt.dailyTemperatures(new int[] { 73, 74, 75, 71, 69 })));

    }
}