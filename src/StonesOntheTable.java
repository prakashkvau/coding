import java.util.Scanner;

public class StonesOntheTable {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int c = Integer.parseInt(s.next());
        char[] st = s.next().toCharArray();
        int count = 0;
        for (int i = 1; i < st.length; i++) {
           if (st[i] == st[i-1]) count++;
        }
        System.out.println(count);
    }
}