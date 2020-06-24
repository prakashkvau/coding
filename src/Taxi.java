import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
  static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    int number = s.nextInt();
    int taxis = 0;
    int[] groups = new int[5];
    for (int i = 0; i < number; i++) {
      groups[s.nextInt()]++;
    }
    taxis += groups[4];
    taxis += groups[2] / 2;
    groups[2] = groups[2] % 2;
    if (groups[3] != 0) {
      if (groups[3] >= groups[1]) {

        taxis += groups[3] + groups[2];
      } else {
        groups[1] -= groups[3];
        taxis += groups[3];
        while (groups[2] > 0) {
          taxis++;
          groups[1] -= 2;
          groups[2]--;
        }
        while (groups[1] > 0) {
          taxis++;
          groups[1] -= 4;
        }
      }
    } else {
      while (groups[2] > 0) {
        taxis++;
        groups[1] -= 2;
        groups[2]--;
      }
      while (groups[1] > 0) {
        taxis++;
        groups[1] -= 4;
      }

    }

    System.out.println(taxis);
  }
}
