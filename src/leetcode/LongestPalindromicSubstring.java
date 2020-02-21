package leetcode;

public class LongestPalindromicSubstring {
    public String pal(String s) {
        int start = 0;
        int max = 1;
        int size = s.length();
        if (size < 1) {
            return "";
        }
        if (size ==1 ) {
            return s;
        }

        int low =0, high = 0;

        for (int i =0; i < size;i++) {
            // check for odd
            low = i-1;
            high = i+1;
            while(low >= 0 && high < size && s.charAt(low) == s.charAt(high)) {
                if (high-low+1 > max) {
                    max = high-low+1;
                    start = low;
                }
                low--;
                high++;
            }
            // check for even

            low = i-1;
            high = i;
            while(low >= 0 && high < size && s.charAt(low) == s.charAt(high)) {
                if (high-low+1 > max) {
                    max = high-low+1;
                    start = low;
                }
                low--;
                high++;
            }


        }

        return s.substring(start, start+max);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.pal("babd"));
    }
}
