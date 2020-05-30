package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(reader.readLine());
    int count = 0;
    String data;
    while((data = reader.readLine()) !=null) {
      if (data.isEmpty()) {
        continue;
      }
      String[] ans = data.split(" ");
      int ans1 = Integer.parseInt(ans[0]);
      int ans2 = Integer.parseInt(ans[1]);
      int ans3 = Integer.parseInt(ans[2]);
      if ((ans1 + ans2 + ans3) >=2) {
        count++;
      }
    }

    System.out.println(count);
  }
}
