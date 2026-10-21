package questions;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null||head.next==null) return head;
            ListNode prev = null;
            ListNode present = head;
            ListNode next = head.next;

            while(present!=null){
                present.next = prev;
                prev = present;
                present = next;
                if(next!=null){
                    next=next.next;
                }
            }

            return prev;

        }

    }
}
