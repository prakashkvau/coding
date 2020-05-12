package leetcode;

public class ReverseString {
  public void reverseString(char[] s) {
    helper(s, 0, s.length - 1);
  }

  public void helper(char[] s, int left, int right) {
    // breaking condition
    if (left >= right) return;

    // swap and increase pointers
    char tmp = s[left];
    s[left++] = s[right];
    s[right--] = tmp;

    // invoke with new pointer
    helper(s, left, right);
  }


  public static void main(String[] args) {
    ReverseString reverseString = new ReverseString();
    reverseString.reverseString(new char[]{'a', 'b', 'c'});
  }
}
