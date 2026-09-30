public class FindNumberThatIsNotRepeatingTwice {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};

        System.out.println("Number that is not repeating twice is: "+ findNonRepeatingNumber(arr));
    }

    //Time Complexity : O(n)
    //Space Complexity : O(1)
    private static int findNonRepeatingNumber(int[] arr) {
        int ans = arr[0];
        //a^a = 0
        //We do XOR of whole array , automatically the non repeating will be left
        //a^0 = a
        for(int i=1;i<arr.length;i++){
            ans = ans^arr[i];
        }

        return ans;
    }
}
