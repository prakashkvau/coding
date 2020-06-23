import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int coins = s.nextInt();
        int sum = 0;
        Integer[] c = new Integer[coins];
        for (int i = 0; i < coins; i++) {
            c[i] = s.nextInt();
            sum = sum + c[i];
        }
        Arrays.sort(c, Collections.reverseOrder());
        int count = 0;
        int tSum = 0;
        for (int i = 0; i < coins; i++) {
            if (tSum > sum / 2) {
                break;
            }
            tSum += c[i];
            count++;
        }
        System.out.println(count);
    }
}