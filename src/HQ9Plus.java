import java.util.Scanner;

public class HQ9Plus {
  static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
   char[] in = s.next().toCharArray();
    boolean res = false;
    for (int i = 0; i < in.length; i++) {
      if(in[i] == 'H' || in[i] == 'Q' || in[i] == '9') {
        res = true;
        break;
      }
    }

    if (res){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
