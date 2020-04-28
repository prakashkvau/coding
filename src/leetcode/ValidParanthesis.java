package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParanthesis {
    public boolean valid(String s) {
        Stack<Character> sD = new Stack<>();
        HashMap<Character, Character> pMap = new HashMap<Character, Character>();
        pMap.put(')', '(');
        pMap.put('}', '{');
        pMap.put(']', '[');

        for (Character c : s.toCharArray()) {
            if (pMap.containsKey(c)) {
                if (sD.isEmpty() || sD.pop() != pMap.get(c)) {
                    return false;
                }
                continue;
            }
            sD.add(c);
        }

        return sD.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        System.out.println(vp.valid("]"));
    }
}