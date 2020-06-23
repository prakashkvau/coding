import java.util.Scanner;

public class WordCaptilization {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String in = s.nextLine();
        String ans = Character.toUpperCase(in.charAt(0)) + in.substring(1);
        System.out.println(ans);
    }
}