import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String ma = s.nextLine();
        String[] nums = ma.split("\\+");
        Arrays.sort(nums);
        String ans = String.join("+", nums);
        System.out.println(ans);
    }
}
