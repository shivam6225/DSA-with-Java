package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetIteration {

    public static void main(String[] args) {
        int[] arr ={ 1,2, 2 ,3};
        System.out.println(subset(arr));
        System.out.println(subsetDuplicate(arr));

    }


    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num:arr){
            int size = outer.size();
            for(int i=0;i<size;i++){
                //Create a copy of the outer list
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start =0;
        int end =0;
        for(int i=0;i<arr.length;i++){
            start=0;
            //if current and previous element is same , s = e+1
            if(i>0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = outer.size() -1;
            int size = outer.size();
            for(int j=start;j<size;j++){
                //Create a copy of the outer list
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
