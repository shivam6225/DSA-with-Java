package binary_search.questions;

public class DivideChocolate {

    class Solution {
        public int maximizeSweetness(int[] sweetness, int k) {

            int n = sweetness.length;
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                sum+=sweetness[i];
                if(sweetness[i]<min){
                    min=sweetness[i];
                }
            }
            int low = min;
            int high = sum/(k+1);
            int ans = 0;

            while(low<=high){
                int mid = low+(high-low)/2;

                if(canBeDivided(sweetness,k+1,mid)==true){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

            return high;

        }

        public boolean canBeDivided(int[] S , int k , int sweet) {

            int sum = 0;
            int cnt = 0;

            for(int i=0;i<S.length;i++){
                if(sum+S[i]>=sweet){
                    cnt++;
                    sum=0;
                }
                else{
                    sum+=S[i];
                }

                if(cnt>=k) return true;
            }

            return false;
        }
    }
}
