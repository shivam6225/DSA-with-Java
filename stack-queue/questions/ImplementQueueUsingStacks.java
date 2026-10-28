package questions;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    //Remove efficient
    class MyQueue {

        Stack<Integer> main;
        Stack<Integer> helper;

        public MyQueue() {
            main = new Stack<>();
            helper = new Stack<>();
        }

        public void push(int x) {
            if(main.isEmpty()){
                main.push(x);
                return;
            }

            while(!main.isEmpty()){
                helper.push(main.pop());
            }

            main.push(x);

            while(!helper.isEmpty()){
                main.push(helper.pop());
            }
        }

        public int pop() {
            return main.pop();
        }

        public int peek() {
            return main.peek();
        }

        public boolean empty() {
            return main.isEmpty();
        }
    }


    //Write Efficient
    class MyQueue2 {

        Stack<Integer> main;
        Stack<Integer> helper;

        public MyQueue2() {
            main = new Stack<>();
            helper = new Stack<>();
        }

        public void push(int x) {
            main.push(x);
        }

        public int pop() {

            while(!main.isEmpty()){
                helper.push(main.pop());
            }

            int removed = helper.pop();

            while(!helper.isEmpty()){
                main.push(helper.pop());
            }

            return removed;
        }

        public int peek() {
            while(!main.isEmpty()){
                helper.push(main.pop());
            }

            int n = helper.peek();

            while(!helper.isEmpty()){
                main.push(helper.pop());
            }

            return n;
        }

        public boolean empty() {
            return main.isEmpty();
        }
    }

    //ammortized O(1)

    class MyQueue3 {

        Stack<Integer> main;
        Stack<Integer> helper;

        public MyQueue3() {
            main = new Stack<>();
            helper = new Stack<>();
        }

        public void push(int x) {
            main.push(x);
        }

        public int pop() {

            if(helper.isEmpty()){
                while(!main.isEmpty()){
                    helper.push(main.pop());
                }
            }

            return helper.pop();
        }

        public int peek() {
            if(helper.isEmpty()){
                while(!main.isEmpty()){
                    helper.push(main.pop());
                }
            }

            return helper.peek();
        }

        public boolean empty() {
            return main.isEmpty() && helper.isEmpty();
        }
    }




}
