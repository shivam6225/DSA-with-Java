import java.util.Arrays;

public class KnuthMorrisPratt {

    public static void main(String[] args){
        System.out.println(search("shivamkunrrkunakunalalrahul","kunal"));
    }

    public static int search(String s , String p){
        if(p.isEmpty()) return 0;

        int[] lps = new int[p.length()];

        int prevLPS = 0;
        int i = 1;

        while(i<p.length()){
            if(p.charAt(i)==p.charAt(prevLPS)){
                lps[i] = prevLPS + 1;
                prevLPS += 1;
                i++;
            }
            else if(prevLPS==0){
                lps[i] = 0;
                i++;
            }
            else{
                prevLPS = lps[prevLPS-1];
            }
        }

        i=0;
        int j=0;

        System.out.println(Arrays.toString(lps));

        while(i<s.length()){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j==0){
                    i++;
                }
                else {
                    j= lps[j-1];
                }
            }
            if(j==p.length()){
                return i-p.length();
            }
        }

        return -1;

    }


}
