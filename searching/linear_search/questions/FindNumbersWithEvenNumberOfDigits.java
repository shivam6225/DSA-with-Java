package linear_search.questions;

//LeetCode Question : 1295
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] arr = {2345 , 45 ,234 ,785, 0 , 345 , 234456 , 1};

        System.out.println("Numbers with Even digits: "+ findNumbers(arr));
    }

    static int findNumbers(int [] nums){
        int count =0;
        for (int num : nums){
            //int digits = String.valueOf(num).length();
            //Make Number positive
            if(num <0){
                num*=-1;
            }

            int digits =0;
            if(num==0) digits=1;
            while(num>0){
                digits++;
                num/=10;
            }

            if(digits%2==0){
                count++;
            }
        }
        return count;
    }


}
