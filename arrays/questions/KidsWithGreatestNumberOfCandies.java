package questions;

import java.util.ArrayList;

public class KidsWithGreatestNumberOfCandies {


        public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> list = new ArrayList<>();

            int maxCandy = 0;
            for(int num:candies){
                maxCandy = Math.max(num,maxCandy);
            }

            for(int num:candies){
                list.add(num+extraCandies >= maxCandy);
            }

            return list;

        }

}
