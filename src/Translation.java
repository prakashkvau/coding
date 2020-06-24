import java.util.Scanner;

public class Translation {
  static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    String in = s.next().trim();
    String rev = s.next().trim();

    if (in.equals(new StringBuilder(rev).reverse().toString())) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
