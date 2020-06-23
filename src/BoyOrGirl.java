import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        char[] cs = s.next().toCharArray();
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < cs.length; i++) {
            s.add(cs[i]);
        }
        if (s.size()%2==0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}