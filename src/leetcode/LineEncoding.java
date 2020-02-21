package leetcode;

/**
 * LineEncoding
 */
public class LineEncoding {
    static String lineEncoding(String s) {
        String ret = "";
        if (s.length() < 1) {
            return "";
        }
        char prev = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != prev) {
                if (count == 1) {
                    ret += String.valueOf(prev);
                } else {
                    ret += String.valueOf(count) + String.valueOf(prev);
                }
                prev = s.charAt(i);
                count = 1;
            } else {
                count++;
            }
            
        }
        if (count == 1) {
            ret += String.valueOf(prev);
        } else {
            ret += String.valueOf(count) + String.valueOf(prev);
        }
        return ret;
    }
    
    
    public static void main(String[] args) {
      System.out.println(lineEncoding("aabbbc"));
    }
}