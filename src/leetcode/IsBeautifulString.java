package leetcode;

import java.util.*;

class IsBeautifulString {
	static boolean isBeautifulString(String inputString) {
    Map<Integer, Integer> m = new HashMap<>();
    
    
    for (int i =0; i < inputString.length(); i++) {
        int save = 0;
        Integer currentChar = Integer.valueOf(inputString.charAt(i));
        Integer pc = (currentChar-1);
        Integer fc = (currentChar+1);
        if (m.containsKey(currentChar)) {
            save = m.get(currentChar) + 1;
        }
        
        m.put(currentChar,save);
        if (m.containsKey(pc) && m.get(currentChar) > m.get(pc)) {
            return false;
        }
        if (m.containsKey(fc) && m.get(currentChar) < m.get(pc)) {
            return false;
        }
    }
    
    return true;
}

public static void main(String[] args) {
	System.out.println(isBeautifulString("bbc"));
}
}