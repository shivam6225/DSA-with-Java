package Arrays;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18 , 2 , 18 ,9};
        int target = 0;
        System.out.println(search(arr,target,0));
        System.out.println(searchFromLast(arr,1,arr.length-1));

        System.out.println(searchAllIndex(arr,18,0, new ArrayList<>()));

        System.out.println(searchAllIndexWithoutArrayArg(arr,18,0));
    }

    public static int search(int[] arr , int target , int index){
        if(index > arr.length-1) return -1;

        if(arr[index]==target) return index;

        else {
            return search(arr,target,index+1);
        }

//        return arr[index] == target || search(arr,target,index+1);
    }


    public static int searchFromLast(int[] arr , int target , int index){
        if(index == -1) return -1;

        if(arr[index]==target) return index;

        else {
            return searchFromLast(arr,target,index-1);
        }

//        return arr[index] == target || search(arr,target,index+1);
    }

    //static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> searchAllIndex(int[] arr , int target , int index , ArrayList<Integer> list){

        if(index > arr.length-1) return list;

        if(arr[index]==target) list.add(index);
        //Keep Searching for all index
        return searchAllIndex(arr,target,index+1 , list);

    }

    public static ArrayList<Integer> searchAllIndexWithoutArrayArg(int[] arr , int target , int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if(index > arr.length-1) return list;

        if(arr[index]==target) list.add(index);
        //Keep Searching for all index
        //Add the list from the recursive calls
        ArrayList<Integer> ansBelowCalls = searchAllIndexWithoutArrayArg(arr,target,index+1);
        list.addAll(ansBelowCalls);
        return list;

    }
}
