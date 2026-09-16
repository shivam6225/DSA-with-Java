package shivam;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //Fibonacci series is a series of numbers in which each number is the sum of the two preceding ones, 
        // usually starting with 0 and 1.
        //The Fibonacci sequence is defined by the recurrence relation:
        //F(n) = F(n-1) + F(n-2)
        //The first two numbers in the Fibonacci sequence are 0 and 1.
        //The Fibonacci sequence is named after the Italian mathematician Leonardo Fibonacci,
        // who introduced the sequence to Western mathematics in his 1202 book Liber Abaci.
        //For example , a=0 , b=1 and n=7 
        //then output will be 0 1 1 2 3 5 8
        //We know how many times loop will run , i.e n times
        //So we can use for loop to print Fibonacci series

        int firstTerm =0;
        int secondTerm =1;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1 ; i<=n ; i++){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        input.close();

        //Sometime code looks cleaner if we use while loop instead of for loop
        firstTerm = 0;
        secondTerm = 1;
        while(n>0){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            n--;
        }

        //Time complexity: O(n) - The loop runs n times, where n is the number of terms in the Fibonacci series to be printed.
        //Space complexity: O(1) - The algorithm uses a constant amount of space, regardless of the input size.
    }
}
