import java.util.Scanner;

public class Elephant {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int d = s.nextInt();
        if (d<=5){
            System.out.println(1);
        } else {
            System.out.println((int)Math.ceil((double)d/5));
        }
    }
}