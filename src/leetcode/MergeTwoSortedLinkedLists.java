package leetcode;


public class MergeTwoSortedLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode prev = ret;
        while(l1!=null && l2!=null) {
            if (l1.val <=l2.val) {
                prev.next = l1;
                l1=l1.next;
            } else {
                prev.next = l2;
                l2=l2.next;
            }
            prev = prev.next;
        }

        prev.next= l1==null ? l2 : l1;

        return ret.next;
    }


    public static void main(String[] args) {
        MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();

    }


}
