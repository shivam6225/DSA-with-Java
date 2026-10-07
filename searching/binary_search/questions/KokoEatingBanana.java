package binary_search.questions;

public class KokoEatingBanana {

        public int minEatingSpeed(int[] piles, int h) {
            int max = 0;
            for(int pile:piles){
                if(pile>max){
                    max=pile;
                }
            }

            int start =1;
            int end = max;

            while(start<end){
                int mid = start + (end-start)/2;

                int totalhours = 0;
                for(int pile:piles){
                    totalhours = (int) (totalhours + Math.ceil((double) pile / mid));
                }

                if(totalhours>h){
                    start = mid+1;
                }
                else{
                    end = mid;
                }
            }

            return end;
        }
}
