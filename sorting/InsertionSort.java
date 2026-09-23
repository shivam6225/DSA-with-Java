import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23 , 45 , -67 , 0 , 4 , 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Adaptive : Steps get reduced when array is sorted
    //Number of Swaps are reduced as compare to Bubble Sort
    //Stable
    //Use for smaller values of N => works good when array is partially sorted
    //TC : O(N^2) Best:O(N)
    //Take part in Hybrid sorting algorithm
    //SC : O(1)
    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            for(int j=i ; j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
                else break;
            }

        }
    }
}
