package questions;

public class DetermineIfStringHalvesAreAlike {

    class Solution {
        public boolean halvesAreAlike(String s) {
            int n=s.length()/2;

            int i=0;
            int fv=0;
            int sv=0;
            while(i<n){
                if(isVowel(s.charAt(i))) fv++;
                if(isVowel(s.charAt(i+n))) sv++;
                i++;
            }

            return fv==sv;
        }

        public boolean isVowel(char ch){
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||
                    ch=='o'||ch=='O'||ch=='u'||ch=='U')
                return true;

            return false;
        }
    }
}
