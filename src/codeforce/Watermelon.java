import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();
    int w = Integer.parseInt(input);
    boolean r = false;
    if (w > 2) {
      r = (w%2==0);
    }
    System.out.println(r ? "YES" : "NO");
  }
}
