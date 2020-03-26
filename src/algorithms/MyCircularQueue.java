package algorithms;

public class MyCircularQueue {
  int[] data;
  int p_start;
  int count;
  int capacity;

  /**
   * Initialize your data structure here. Set the size of the queue to be k.
   */
  public MyCircularQueue(int k) {
    data = new int[k];
    p_start = 0;
    count = 0;
    capacity = k;
  }

  /**
   * Insert an element into the circular queue. Return true if the operation is successful.
   */
  public boolean enQueue(int value) {

    if (capacity == count) {
      return false;
    }

    data[(p_start + count) % capacity] = value;
    count++;

    return true;
  }

  /**
   * Delete an element from the circular queue. Return true if the operation is successful.
   */
  public boolean deQueue() {
    if (count == 0) {
      return false;
    }
    p_start = (p_start + 1) % capacity;
    count--;
    return true;
  }

  /**
   * Get the front item from the queue.
   */
  public int Front() {
    if (count == 0) {
      return -1;
    }
    return data[p_start];
  }

  /**
   * Get the last item from the queue.
   */
  public int Rear() {
    if (count == 0) {
      return -1;
    }
    return data[(p_start + count - 1) % capacity];
  }

  /**
   * Checks whether the circular queue is empty or not.
   */
  public boolean isEmpty() {
    return count == 0;
  }

  /**
   * Checks whether the circular queue is full or not.
   */
  public boolean isFull() {
    return count == capacity;
  }

  public static void main(String[] args) {
    MyCircularQueue obj = new MyCircularQueue(3);
    System.out.println(obj.enQueue(1));
    System.out.println(obj.enQueue(2));
    System.out.println(obj.enQueue(3));
    System.out.println(obj.enQueue(4));
    System.out.println(obj.Rear());
    System.out.println(obj.isFull());
    System.out.println(obj.deQueue());
    System.out.println(obj.enQueue(4));
    System.out.println(obj.Rear());
  }
}

