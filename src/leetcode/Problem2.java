package leetcode;

public class Problem2 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 2->4->3 + 5->6->4
        // out 7->0->8
        ListNode ret = new ListNode(0);
        ListNode curr = ret;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = 0;
            int y = 0;
            if (l1 != null) {
                x = l1.val;
            }
            if (l2 != null) {
                y = l2.val;
            }
            int sum = x + y + carry;
            ListNode temp = new ListNode(sum % 10);
            curr.next = temp;

            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return ret.next;
    }



    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();

    }
}
