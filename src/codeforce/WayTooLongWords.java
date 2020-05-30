package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {
  public static void main(String[] args) throws IOException {
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();
    int size = Integer.parseInt(input);
    String w;
    while( (w = reader.readLine())!=null) {
      if (w.length() <= 10) {
        System.out.println(w);
      } else {
        System.out.println(w.charAt(0) + String.valueOf(w.length()-2) + w.charAt(w.length()-1));
      }
    }
  }
}
