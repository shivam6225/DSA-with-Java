import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {23 , 45 , -67 , 0 , 4 , 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //TC = O(N^2)
    //Best Case = O(N) when array is already sorted
    //Stable Sorting Algorithm /In Place Sorting
    //Exchange Sort or Linking Sort
    static void bubbleSort(int[] arr){
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                //swap if item is smaller than previous
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
