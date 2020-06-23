import java.util.Scanner;

public class Tram {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int stops = s.nextInt();
        int maxPassengers  = 0;
        int tP = 0;
        for (int i = 0; i < stops; i++) {
           int ex = s.nextInt();
            int en = s.nextInt();
            tP = tP - ex +en;
            maxPassengers = Math.max(maxPassengers, tP);
        }

        System.out.println(maxPassengers);
    }
}