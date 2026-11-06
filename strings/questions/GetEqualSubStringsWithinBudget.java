package questions;

public class GetEqualSubStringsWithinBudget {
    class Solution {
        public int equalSubstring(String s, String t, int maxCost) {
            int i=0;
            int j=0;
            int cost=0;
            char[] sh= s.toCharArray();
            char[] th= t.toCharArray();

            for(;j<s.length();j++){
                cost += Math.abs((sh[j]-'a')-(th[j]-'a'));
                if(cost>maxCost){
                    cost-=Math.abs((sh[i]-'a')-(th[i]-'a'));
                    i++;
                }
            }

            return j-i;
        }
    }
}
