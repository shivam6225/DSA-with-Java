package questions;


public class SortList {


    class Solution {

        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
        }


        public ListNode sortList(ListNode head) {

            if(head==null || head.next==null){
                return head;
            }

            ListNode mid = getMid(head);
            ListNode left = sortList(head);
            ListNode right = sortList(mid);

            return merge(left,right);

        }



        public ListNode merge(ListNode l1,ListNode l2){
            ListNode temp = new ListNode(0);
            ListNode curr = temp;

            while(l1!=null&&l2!=null){
                if(l1.val>=l2.val){
                    curr.next=l2;
                    l2=l2.next;
                }
                else{
                    curr.next=l1;
                    l1=l1.next;
                }
                curr=curr.next;
            }

            curr.next = (l1!=null) ? l1 : l2;

            return temp.next;
        }

        public ListNode getMid(ListNode head){
            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head;

            while(fast!=null && fast.next!=null){
                prev = slow;
                slow=slow.next;
                fast=fast.next.next;
            }

            if(prev!=null){
                prev.next = null;
            }

            return slow;
        }
    }
}
