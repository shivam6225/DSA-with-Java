package questions;

public class ReorderList {


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
        public void reorderList(ListNode head) {
            if(head==null || head.next==null){
                return;
            }

            ListNode mid = middleNode(head);
            ListNode headSecond = reverseList(mid);

            ListNode headFirst = head;

            while(headFirst!=null && headSecond!=null){
                ListNode temp = headFirst.next;
                headFirst.next = headSecond;
                headFirst = temp;

                temp = headSecond.next;
                headSecond.next = headFirst;
                headSecond = temp;
            }

            if(headFirst!=null){
                headFirst.next = null;
            }


        }

        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            return slow;
        }

        public ListNode reverseList(ListNode head) {
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
