import java.util.Scanner;

public class PetyaAndStrings {
    static Scanner s  = new Scanner(System.in);
    public static void main(String[] args) {
        String s1 = s.next().toLowerCase();
        String s2 = s.next().toLowerCase();
        int comp = s1.compareTo(s2);

        if (comp >= 1) {
            System.out.println(1);
        } else if (comp < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
