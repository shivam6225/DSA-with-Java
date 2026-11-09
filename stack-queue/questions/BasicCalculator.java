package questions;

import java.util.Stack;

public class BasicCalculator {

    class Solution {
        public int calculate(String s) {
            Stack<Object> stack = new Stack<>();
            int currentNum = 0;
            int len=s.length();
            int n=0;

            for(int i=len-1;i>=0;i--){
                char ch =s.charAt(i);

                if(ch>='0' && ch<='9'){
                    currentNum = (int)Math.pow(10,n) * (ch-'0') + currentNum;
                    n++;
                }
                else if(ch!=' '){
                    if(n!=0){
                        stack.push(currentNum);
                        n=0;
                        currentNum=0;
                    }
                    if(ch=='('){
                        int res = evaluate(stack);
                        stack.pop();

                        stack.push(res);
                    }
                    else {
                        stack.push(ch);
                    }
                }
            }

            if(n!=0){
                stack.push(currentNum);
            }

            return evaluate(stack);

        }

        public int evaluate(Stack<Object> stack){
            //If stack is empty or top value is not integer
            if(stack.empty() || !(stack.peek() instanceof Integer)){
                stack.push(0);
            }

            int res = (int) stack.pop();

            while(!stack.empty() && !((char)stack.peek()==')')){

                if((char)stack.pop()=='-'){
                    res-=(int)stack.pop();
                }
                else{
                    res+=(int)stack.pop();
                }
            }

            return res;

        }
    }
}
