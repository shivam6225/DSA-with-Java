package binary_search.questions;

public class ArrangingCoins {

        public int arrangeCoins(int n) {

            long start =1;
            long end = n;

            while(start<=end){
                long mid = start + (end-start)/2;

                long ans = (mid*(mid+1)>>1) ;

                if(ans==n) return (int)mid;

                else if(ans > n) end = mid-1;
                else {
                    start = mid+1;
                }
            }

            return (int)end;
        }
}
