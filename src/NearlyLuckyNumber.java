import java.util.Scanner;

public class NearlyLuckyNumber {
  static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
   char[] i = s.next().trim().toCharArray();
    int count  = 0;
    for (int j = 0; j < i.length; j++) {
      if(i[j]== '4' || i[j] =='7') {
       count++;
      }
    }

    if (count == 4 || count ==7)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
