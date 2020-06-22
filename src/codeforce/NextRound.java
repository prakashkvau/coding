import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextRound {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));
    String[] meta = reader.readLine().split(" ");
    String[] data = reader.readLine().split(" ");
    int k = Integer.parseInt(meta[1]);
    int kd = Integer.parseInt(data[k-1]);
    int count = 0;
    for (String d:data) {
      int x = Integer.parseInt(d);
      if (x >0 && x >= kd) {
        count++;
      }
    }

    System.out.println(count);
  }
}
