import java.util.Scanner;

public class Football {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String in = s.next();
        if(in.contains("0000000") || in.contains("1111111")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}