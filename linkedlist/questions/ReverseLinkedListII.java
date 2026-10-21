package questions;

public class ReverseLinkedListII {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head==null || head.next==null) return head;
            if(left==right) return head;

            //skip first left-1 nodes

            ListNode present = head;
            ListNode prev = null;

            for(int i=0;present!=null && i<left-1;i++){
                prev = present;
                present = present.next;
            }

            ListNode last = prev;
            ListNode newEnd = present;
            ListNode next = present.next;

            //reverse between left and right

            for(int i=0;i<(right-left+1) && present!=null ;i++){
                present.next = prev;
                prev = present;
                present = next;
                if(next!=null){
                    next=next.next;
                }
            }

            if(last!=null){
                last.next=prev;
            }
            else{
                head = prev;
            }

            newEnd.next = present;

            return head;
        }
    }
}
