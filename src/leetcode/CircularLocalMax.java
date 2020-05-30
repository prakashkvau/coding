package leetcode;

public class CircularLocalMax {
  public static int maxSubarraySumCircular(int[] A) {
    if (A.length <=0) {
      return -1;
    }
    int start, max, local;
    start = max = local= A[0];
    int localStart = 0;
    for(int i = 1 ; i< A.length;i++) {
      local = local + A[i];
      if (A[i] >= local) {
        localStart = i;
        local = A[i];
      }
      if (i == A.length -1) {
        if (local + start > local && localStart !=0) {
          local = local + start;
        }
      }
      max = Math.max(max,local);
    }

    return max;
  }

  public static void main(String[] args) {
    System.out.println(maxSubarraySumCircular(new int[]{-2,4,-5,4,-5,9,4}));
  }
}
