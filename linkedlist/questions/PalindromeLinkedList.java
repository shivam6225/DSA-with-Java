package questions;

public class PalindromeLinkedList {

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
        public boolean isPalindrome(ListNode head) {
            ListNode mid = middleNode(head);

            ListNode headSecond = reverseList(mid);
            ListNode reReverseHead = headSecond;

            //compare both the halves
            while(head!=null && headSecond!=null){
                if(head.val != headSecond.val){
                    return false;
                }
                head = head.next;
                headSecond = headSecond.next;
            }

            reverseList(reReverseHead);

            return true;
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
