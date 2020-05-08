package leetcode;

/**
 * https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/
 */
public class CheckStraightLine {
  public boolean checkStraightLine(int[][] coordinates) {
    if (coordinates.length <= 2) {
      return true;
    }
    float slope = getSlope(coordinates[0], coordinates[1]);

    for (int i = 2; i < coordinates.length; i++) {
      if (getSlope(coordinates[i], coordinates[i - 1]) != slope) {
        return false;
      }
    }

    return true;
  }

  private float getSlope(int[] first, int[] second) {
    return (float) (second[1] - first[1]) / (second[0] - first[0]);
  }

  public static void main(String[] args) {
    CheckStraightLine checkStraightLine = new CheckStraightLine();
    System.out.println(checkStraightLine.checkStraightLine(new int[][]{{-4, -3}, {1, 0}, {3, -1}, {0, -1}, {-5, 2}}));
  }
}
