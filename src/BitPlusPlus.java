import java.util.Scanner;

public class BitPlusPlus {
    static Scanner s  = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 0;
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            String st = s.next();
            if (st.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
