package questions;

public class ReverseNodesInKGroups {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if(k<=1 || head==null) return head;

            //skip first left-1 nodes

            ListNode present = head;
            ListNode prev = null;

            while(present!=null) {

                ListNode check = present;

                int count = 0;
                while(count<k&&check!=null){
                    check=check.next;
                    count++;
                }
                if(count<k) break;

                ListNode last = prev;
                ListNode newEnd = present;
                ListNode next = present.next;

                //reverse between left and right

                for(int i=0;i<k && present!=null ;i++){
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

                prev = newEnd;

            }

            return head;
        }
    }
}
