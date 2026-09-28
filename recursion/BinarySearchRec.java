public class BinarySearchRec {

    public static void main(String[] args) {
        int[] arr = {1 , 56 ,89 , 100 , 123};
        System.out.println(searchRec(arr,0,arr.length,89));

    }

    private static int searchRec(int[] arr,int start , int end,int target) {
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) {
            return searchRec(arr,start,mid-1,target);
        }
        else {
            return searchRec(arr,mid+1,end,target);
        }
    }
}
