import java.util.Arrays;
import java.util.Scanner;

public class ApplemanAndToastman {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    String[] snums = scanner.nextLine().trim().split("\\s");
    int[] nums = new int[num];
    for (int i = 0; i < num; i++) {
      nums[i]  = Integer.parseInt(snums[i]);
    }
    score(nums);
    System.out.println(count);

  }
  static int count = 0;
  public static void score(int[] one) {
      if (one.length <=1) {
        return;
      }

    for (int i = 0; i < one.length; i++) {
      count+= one[i];
    }

    Arrays.sort(one);
    score(Arrays.copyOfRange(one, 0, 1));
    score(Arrays.copyOfRange(one, 1, one.length));
  }
}
