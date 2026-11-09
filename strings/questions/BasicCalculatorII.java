package questions;

import java.util.Stack;

public class BasicCalculatorII {

    class Solution {
        public int calculate(String s) {
            Stack<Integer> stack = new Stack<>();
            int currentNum = 0;
            char operation = '+';
            int len=s.length();

            for(int i=0;i<len;i++){
                char ch = s.charAt(i);
                if(ch>='0' && ch<='9'){
                    currentNum=currentNum*10+(ch-'0');
                }

                if(!(ch>='0' && ch<='9') && ch!=' ' || i==len-1){
                    if(operation=='-'){
                        stack.push(-currentNum);
                    }
                    else if(operation=='+'){
                        stack.push(currentNum);
                    }
                    else if(operation=='*'){
                        stack.push(stack.pop()*currentNum);
                    }
                    else if(operation=='/'){
                        stack.push(stack.pop()/currentNum);
                    }
                    operation = ch;
                    currentNum = 0;
                }
            }

            int result=0;

            while(!stack.isEmpty()){
                result+=stack.pop();
            }

            return result;

        }
    }

}
