package shivam;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    //It will change value of original array
    //arr and nums pointing to the same value
    //when object is modified by nums , it will modify the original object
    //the reference is actually passed by call by value
    static void change(int[] nums){
        nums[0]=99;
    }
}
