package linear_search.questions;

//Leetcode : 1672
public class RichestCustomerWealth {

    public static void main(String[] args) {
        int [] [] accounts = {{1,2,3},{3,2,1}};

        int maxWealth = maximumWealth(accounts);

        System.out.println("Maximum Wealth: "+maxWealth);
    }

    private static int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for(int[] customer:accounts){
            int sum =0;
            for(int money:customer){
                sum+=money;
            }
            if(max<sum) max=sum;
        }

        return max;
    }
}
