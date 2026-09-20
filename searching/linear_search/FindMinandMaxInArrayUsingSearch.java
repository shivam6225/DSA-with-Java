package linear_search;

public class FindMinandMaxInArrayUsingSearch {

    public static void main(String[] args) {
        int[] arr ={23 , 67 ,32, -1 ,0};

        int min = minimumArray(arr);

        int max = maximumArray(arr);

        System.out.println("Min and Max in array are: "+ min +" "+ max);

    }

    private static int maximumArray(int[] arr) {

        int min = Integer.MAX_VALUE;

        for(int num : arr){
            min = Math.min(num , min);
        }

        return min;
    }

    private static int minimumArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for(int num:arr){
            max = Math.max(num , max);
        }

        return max;
    }
}
