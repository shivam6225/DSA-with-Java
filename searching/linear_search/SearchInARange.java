package linear_search;

public class SearchInARange {

    public static void main(String[] args) {

        int[] arr ={23 , 67 ,32, -1 ,0};
        int target = 67;
        int ans = linearSearch(arr,target,0,2);

        System.out.println("Element Found In Range at index: "+ ans);

    }

    //Searching using range
    static int linearSearch(int[] arr,int target , int start , int end){
        if(start>end){
            return -1;
        }

        //run loop 0:n-1
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element==target)
            {
                return i;
            }

        }

        //element doesn't exist in the array
        return -1;
    }

}
