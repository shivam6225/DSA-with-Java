package questions;

public class LastSubstringInLexicographicalOrder {

    class Solution {
        public String lastSubstring(String s) {
            int i = 0, j = 1, k = 0;
            int n = s.length();
            char[] sh = s.toCharArray();

            while (j + k < n) {
                if (sh[i + k] == sh[j + k]) {
                    k++;
                    continue;
                } else if (sh[i + k] < sh[j + k]) {
                    i = Math.max(i + k + 1, j);
                    j = i + 1;
                } else {
                    j = j + k + 1;
                }
                k=0;
            }

            return s.substring(i);
        }
    }
}
