import java.util.Scanner;

public class Younghysicist {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = Integer.parseInt(s.nextLine());
        int xsum = 0;
        int ysum = 0;
        int zsum = 0;
        for (int i = 0; i < size; i++) {
            String[] v = s.nextLine().split(" ");
            xsum += Integer.parseInt(v[0]);
            ysum += Integer.parseInt(v[1]);
            zsum += Integer.parseInt(v[2]);
        }
        if (xsum == 0 && ysum == 0 && zsum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}