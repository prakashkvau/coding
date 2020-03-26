package leetcode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
  Queue<Integer> data;
  int sum;
  int size;

  /**
   * Initialize your data structure here.
   */
  public MovingAverage(int size) {
    data = new LinkedList<>();
    sum = 0;
    this.size = size;
  }

  public double next(int val) {
    if (data.size() == size) {
      sum -= data.poll();
    }

    if (data.offer(val)) {
      sum += val;
    }

    return (double) sum / data.size();
  }

  public static void main(String[] args) {

    MovingAverage obj = new MovingAverage(5);
    System.out.println(obj.next(5));
    System.out.println(obj.next(10));
    System.out.println(obj.next(2));
  }
}
