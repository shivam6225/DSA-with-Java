package linear_search;

public class Main {
    public static void main(String[] args) {

        int[] nums = {12 ,-34 , 23 , 45 ,78 ,0};
        int target = 34;
        int ans = linearSearch(nums,target);
        System.out.println("Element found at Index: "+ ans);

    }

    //search the target and return the element
    //Instead of removing index just return element
    static int linearSearch2(int[] arr,int target){

        //run loop 0:n-1
        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }

        //element doesn't exist in the array
        return Integer.MAX_VALUE;
    }

    //search in the array : return the index if item found
    //otherwise return -1
    //Time : O(n) , Space : O(1)
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        //run loop 0:n-1
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target)
            {
                return i;
            }

        }

        //element doesn't exist in the array
        return -1;
    }


    static boolean linearSearch3(int[] arr,int target){

        //run loop 0:n-1
        for (int element : arr) {
            if (element == target) {
                return false;
            }

        }

        //element doesn't exist in the array
        return true;
    }
}
