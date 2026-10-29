package questions;

public class LongPressedName {

    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            int j=0;
            int i=0;

            int m=name.length();
            int n=typed.length();

            while(j<n){
                if(i<m && name.charAt(i)==typed.charAt(j)){
                    i++;
                    j++;
                }
                else if (i>0 && name.charAt(i-1)==typed.charAt(j)){
                    j++;
                }
                else{
                    return false;
                }
            }

            return i==m;
        }
    }
}
