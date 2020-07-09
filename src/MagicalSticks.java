import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MagicalSticks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    for (int i = 0; i < size; i++) {
      int x = scanner.nextInt();
      System.out.println((int)(Math.ceil(x/2.0)));
    }
  }
}