import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {23 , 45 , -67 , 0 , 4 , 6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //TC : O(N^2)
    //Unstable Algorithm - origin value not maintained
    //SC : O(1)
    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int last = arr.length -i -1;
            int maxIdx = getMaxIndex(arr,0,last);

            int temp = arr[maxIdx];
            arr[maxIdx] = arr[last];
            arr[last] = temp;
        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int j = 0; j <= last; j++) {
            if(arr[j]>arr[max]){
                max=j;
            }
        }

        return max;
    }
}
