package questions;

import java.util.Stack;

public class ValidParentheses {

    class Solution {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            if(s.length()%2!=0) return false;

            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='['){
                    stack.push(ch);
                }
                else {
                    if(stack.isEmpty()) return false;
                    if(ch==')'){
                        if(stack.peek()!='(') return false;
                    }
                    else if(ch=='}'){
                        if(stack.peek()!='{') return false;
                    }
                    else if(ch==']'){
                        if(stack.peek()!='[') return false;
                    }
                    stack.pop();
                }
            }

            return stack.isEmpty();

        }
    }

    class Solution2 {
        public boolean isValid(String s) {
            if (s.length() % 2 != 0) return false;

            char[] stack = new char[s.length()];
            int head=0;

            for (char c : s.toCharArray()) {
                if (c == '(') stack[head++]=')';
                else if (c == '{') stack[head++]='}';
                else if (c == '[') stack[head++]=']';
                else if (head==0 || stack[--head] != c) return false;
            }

            return head==0;
        }
    }
}
