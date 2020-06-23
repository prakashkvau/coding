import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringTask {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String in = s.next();
        Set<Character> vow = new HashSet<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        vow.add('y');
        String ret = "";
        for (Character c:
             in.toCharArray()) {
            c = Character.toLowerCase(c);
            if(vow.contains(c)) {
                continue;
            }
            ret += "." + c.toString();
        }

        System.out.println(ret);
    }
}
