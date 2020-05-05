package leetcode;

import java.util.ArrayList;
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

  public static void main(String[] args) {
    List<List<Integer>> rooms = new ArrayList<>();

    List<Integer> room0 = new ArrayList<>();
    room0.add(1);

    List<Integer> room1 = new ArrayList<>();
    room1.add(2);

    List<Integer> room2 = new ArrayList<>();
    room2.add(2);

    rooms.add(room0);
    rooms.add(room1);
    rooms.add(room2);

    KeysAndRooms ks = new KeysAndRooms();
    System.out.println(ks.canVisitAllRooms(rooms));
  }
}