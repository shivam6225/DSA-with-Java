package binary_search.questions;

public class CapacityToShipPackageWithinDDays {

        public int shipWithinDays(int[] weights, int days) {
            int totalWeight =0;
            int maxWeight =0;
            for(int weight:weights){
                totalWeight+=weight;
                if(maxWeight<weight) maxWeight = weight;
            }

            int start =0;
            int end = totalWeight;

            while(start<end){
                int mid = start + (end-start)/2;
                System.out.println(start+" "+end+" "+mid+" ");
                int p_days = 0;
                int total =0;
                for(int weight:weights){
                    if(total+weight>mid){
                        p_days++;
                        total = 0;
                    }
                    total+=weight;
                }
                if(total>0) p_days++;

                System.out.println(p_days);

                if(p_days<=days && mid>=maxWeight) {
                    end = mid;
                }
                else {
                    start = mid+1;
                }

            }

            return end;
        }
}
