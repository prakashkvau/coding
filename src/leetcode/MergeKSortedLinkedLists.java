package leetcode;

import java.util.Arrays;
import java.util.List;

public class MergeKSortedLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head=null;
        ListNode former=null;
        while (l1!=null&&l2!=null) {
            if (l1.val>l2.val) {
                if (former==null) former=l2; else former.next=l2;
                if (head==null) head=former; else former=former.next;
                l2=l2.next;
            } else {
                if (former==null) former=l1; else former.next=l1;
                if (head==null) head=former; else former=former.next;
                l1=l1.next;
            }
        }
        if (l2!=null) l1=l2;
        former.next=l1;
        return head;

    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list = Arrays.asList(lists);
        if (list.size()==0) return null;
        if (list.size()==1) return list.get(0);
        if (list.size()==2) return mergeTwoLists(list.get(0), list.get(1));
        return mergeTwoLists(
                mergeKLists(list.subList(0, list.size()/2).toArray(new ListNode[list.size()/2])),
                mergeKLists(list.subList(list.size()/2, list.size()).toArray(new ListNode[list.size() - list.size()/2])));
    }

    public static void main(String[] args) {
        MergeKSortedLinkedLists mergeKSortedLinkedLists= new MergeKSortedLinkedLists();
    }
}
