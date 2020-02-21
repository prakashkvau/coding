package leetcode;

/**
 * IsMAC48Address
 */
public class IsMAC48Address {

    static boolean isMAC48Address(String inputString) {
        String[] s = inputString.split("-");
        if (inputString.length() != s.length * 2 + s.length - 1) {
            return false;
        };
        for (int i = 0; i < s.length; i++) {
            char first = s[i].charAt(0);
            char second = s[i].charAt(1);

            if ( ! (Character.isDigit(first) || (first >= 'A' && first <= 'F' )) ||
            ! (Character.isDigit(second) ||(second >= 'A' && second <='F'))
            ) return false; 
            
        }
        return true;
    }

    
    public static void main(String[] args) {
    System.out.println(isMAC48Address("12-34-56-78-9A-BC"));        
    }
}