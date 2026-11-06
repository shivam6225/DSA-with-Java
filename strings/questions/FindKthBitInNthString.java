package questions;

public class FindKthBitInNthString {

    class Solution {
        public char findKthBit(int n, int k) {
            if(k==1) return '0';
            if(k==2) return '1';
            int curr = 1;
            int sn=1;

            for(int i=2;i<=n;i++){
                curr=curr*2+1;
                if(curr>=k){
                    sn=i;
                    break;
                }
            }

            String s = "0";

            for(int i=1;i<sn;i++){
                String temp = s;
                s = temp + "1" + reverse(invert(temp));
            }


            return s.charAt(k-1);

        }

        public String reverse(String s){
            char[] sh = s.toCharArray();
            int i=0;
            int j=sh.length-1;
            while(i<j){
                char temp = sh[i];
                sh[i] = sh[j];
                sh[j] = temp;
                i++;
                j--;
            }

            return new String(sh);
        }

        public String invert(String s){
            char[] sh = s.toCharArray();
            int i =0;
            while(i<sh.length){
                sh[i]=(char)(sh[i]^1);
                i++;
            }

            return new String(sh);
        }
    }
}
