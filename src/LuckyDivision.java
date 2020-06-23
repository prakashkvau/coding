import java.util.Scanner;

public class LuckyDivision {
    static Scanner s = new Scanner(System.in);
    public static boolean luc(String s){
        boolean luc = false;
        char[] carr = s.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            int x = Integer.parseInt(String.valueOf(carr[i]));
            if (x == 4 || x == 7) {
                luc = true;
            } else {
                luc = false;
                break;
            }
        }
        return luc;
    }

    public static void main(String[] args) {
        String n = s.next();
        boolean luc = false;
        int num = Integer.parseInt(n);
        luc = luc(n);
        if (!luc) {
            for (int i = 0; i < num; i++) {
                if (luc(String.valueOf(i)) && num % i == 0) {
                    luc = true;
                    break;
                }
            }
        }
        if (num % 4 == 0 || num % 7 == 0) {
            luc = true;
        }

        if (luc)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}