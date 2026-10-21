package questions;

public class LinkedListCycleII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            int length = 0;
            ListNode slow = head;
            ListNode fast = head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    ListNode temp = slow;
                    do{
                        temp=temp.next;
                        length++;
                    }while(temp!=slow);
                    break;
                }
            }
            if(length ==0 ) return null;

            //find the start node
            ListNode first = head;
            ListNode second = head;

            while(length>0){
                second = second.next;
                length--;
            }

            //keep moving both forward and they will meet at cycle start

            while(first!=second){
                first=first.next;
                second=second.next;
            }

            return first;

        }
    }
}
