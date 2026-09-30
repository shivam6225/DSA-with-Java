package binary_search.questions;

public class ValidPerfectSquare {

        public boolean isPerfectSquare(int num) {
            long sq = 0;
            if(num<2) return true;
            long start = 2;
            long end = num/2;
            while(start<=end) {
                long mid = start + (end-start)/2;
                sq = mid*mid;
                if(sq > num) end = mid -1;
                else if (sq < num) start = mid +1;
                else if (sq == num ){
                    return true;
                }

            }

            return false;
        }
}
