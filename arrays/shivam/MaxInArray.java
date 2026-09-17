package shivam;

public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = {1,3, 45,6,82};

        System.out.println(max(arr));
        System.out.println(max(arr,0,3));
    }

    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    static int max(int[] arr ,int  index1 , int index2){
        if(index1>index2){
            return -1;
        }
        int max=arr[index1];
        for (int i = index1+1; i <= index2; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }


}
