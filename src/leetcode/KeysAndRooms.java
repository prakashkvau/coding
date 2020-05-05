package leetcode;

import java.util.List;
import java.util.Stack;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       boolean[] seen = new boolean[rooms.size()];
       seen[0] = true;
       Stack<Integer> s = new Stack<>();
       s.push(0);
       
       while(!s.isEmpty()) {
           int d = s.pop();
           for(int n: rooms.get(d)) {
               if (!seen[n]) {
                   seen[n] = true;
                   s.push(n);
               }
           }
       }

       for(boolean v: seen) {
           if (!v) return false;
        }
        return true;
    }
}