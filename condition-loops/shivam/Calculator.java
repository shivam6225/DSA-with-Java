package shivam;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans =0;
        while(true){
            //take operator as input
            char op = input.next().trim().charAt(0);
            //Doing operation between two numbers based on operator
            //using if else if ladder to perform operation based on operator
            if(op=='+' || op =='-' || op =='*' || op=='/' || op=='%'){
                //input two numbers
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op=='+') {
                    ans = num1+num2;
                } else if (op=='-') {
                    ans = num1-num2;
                } else if (op=='*') {
                    ans = num1*num2;
                } else if (op=='/') {
                    if(num2!=0){
                        ans=num1/num2;
                    }
                } else {
                    ans = num1%num2;
                }
                System.out.println("Answer "+ ans);
            } else if (op=='x' || op =='X') {
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
        }
    }
}
