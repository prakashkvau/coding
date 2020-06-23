import java.util.Scanner;

public class WrongSubtraction {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int num = s.nextInt();
        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
           if (num%10==0) {
               num = num/10;
           } else {
               num--;
           }
        }
        System.out.println(num);
    }
}