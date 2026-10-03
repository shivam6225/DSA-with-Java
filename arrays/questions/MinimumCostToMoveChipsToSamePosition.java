package questions;

public class MinimumCostToMoveChipsToSamePosition {

    public int minCostToMoveChips(int[] position) {
        int evenCost =0;
        int oddCost=0;

        for(int chip:position){
            if(chip%2==0) {
                evenCost++;
            }
            else{
                oddCost++;
            }
        }

        return Math.min(evenCost,oddCost);
    }

}
