import java.util.Scanner;

public class BeautifulMatrix {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            char[] ro = s.nextLine().replaceAll("\\s", "").toCharArray();
            for (int j = 0; j < 5; j++) {
                if(ro[j] == '1') {
                    System.out.println(Math.abs(j-2) + Math.abs(i-2));
                    break;
                }
            }
        }

    }
}
