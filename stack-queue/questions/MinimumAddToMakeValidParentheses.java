package questions;

import java.util.Stack;

public class MinimumAddToMakeValidParentheses {

    class Solution {
        public int minAddToMakeValid(String s) {

            Stack<Character> stack = new Stack<>();

            int count = 0;

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(') stack.push('(');
                else{
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        count+=1;
                    }
                }
            }

            return stack.size()+count;

        }
    }


    class Solution2 {
        public int minAddToMakeValid(String s) {

            int count = 0;
            int open = 0;

            for(char ch:s.toCharArray()){
                if(ch=='(') open++;
                else{
                    if(open>0){
                        open--;
                    }
                    else{
                        count++;
                    }
                }
            }

            return open+count;

        }
    }
}
