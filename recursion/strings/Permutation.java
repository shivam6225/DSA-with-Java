package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        permutation("","abc");
        System.out.println();
        ArrayList<String> ans = permutation2("","abcd");
        System.out.println(ans);
        System.out.println(permutationCount("","abcd"));
    }

    static void permutation(String p , String un){
        if(un.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = un.charAt(0);
        int size = p.length() + 1;

        for(int i=0;i<size;i++){
            String first = p.substring(0,i);
            String second = p.substring(i,size-1);
            permutation(first+ch+second,un.substring(1));
        }
    }

    //return list with all permutation
    static ArrayList<String> permutation2(String p , String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = un.charAt(0);
        int size = p.length() + 1;

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<size;i++){
            String first = p.substring(0,i);
            String second = p.substring(i,size-1);
            ans.addAll(permutation2(first+ch+second,un.substring(1)));
        }

        return ans;
    }

    //Count Number of Permutation
    static int permutationCount(String p , String un){
        if(un.isEmpty()){
            return 1;
        }
        char ch = un.charAt(0);
        int size = p.length() + 1;
        int count =0;

        for(int i=0;i<size;i++){
            String first = p.substring(0,i);
            String second = p.substring(i,size-1);
            count+=permutationCount(first+ch+second,un.substring(1));
        }

        return count;
    }


}
