package questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementStackUsingQueue {

    class MyStack {

        Deque<Integer> main;
        Deque<Integer> helper;

        public MyStack() {
            main = new ArrayDeque<>();
            helper = new ArrayDeque<>();
        }

        public void push(int x) {
            while(!main.isEmpty()){
                helper.offer(main.poll());
            }

            main.offer(x);

            while(!helper.isEmpty()){
                main.offer(helper.poll());
            }
        }

        public int pop() {
            return main.poll();
        }

        public int top() {
            return main.peek();
        }

        public boolean empty() {
            return main.isEmpty();
        }
    }


    class MyStack2 {

        Deque<Integer> main;
        Deque<Integer> helper;

        public MyStack2() {
            main = new ArrayDeque<>();
            helper = new ArrayDeque<>();
        }

        public void push(int x) {
            main.offer(x);
        }

        public int pop() {
            while(main.size()>1){
                helper.offer(main.poll());
            }

            int removed = main.poll();

            while(!helper.isEmpty()){
                main.offer(helper.poll());
            }

            return removed;
        }

        public int top() {
            while(main.size()>1){
                helper.offer(main.poll());
            }

            int n = main.poll();
            helper.offer(n);

            while(!helper.isEmpty()){
                main.offer(helper.poll());
            }

            return n;
        }

        public boolean empty() {
            return main.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */


}
