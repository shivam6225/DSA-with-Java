package binary_search.questions;

public class FirstBadVersion {

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
        public int firstBadVersion(int n) {
            int start =1;
            int end = n;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(true){
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }

            return start;
        }
}
