package questions;

public class RotateList {

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
        public ListNode rotateRight(ListNode head, int k) {
            if(k==0 || head==null) return head;
            ListNode newLast = head;
            ListNode temp =head;
            ListNode tail = null;

            int length = 0;
            while(temp!=null){
                tail = temp;
                temp=temp.next;
                length++;
            }

            k=k%length;

            for(int i=0;i<(length-k-1);i++){
                newLast=newLast.next;
            }

            tail.next = head;

            head = newLast.next;
            newLast.next = null;

            return head;
        }
    }
}
