import java.util.Scanner;

public class QueueAtTheSchool {
  static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    int nc = s.nextInt();
    int t = s.nextInt();

    char[] ar = s.next().trim().toCharArray();

    for (int i = 0; i < t; i++) {
      for (int j = 0; j < nc-1; j++) {
         if (ar[j] == 'B'  && ar[j+1] == 'G') {
           ar[j] = 'G';
           ar[j+1] = 'B';
           j++;
         }
      }
    }
    System.out.println(String.valueOf(ar).toString());
  }
}