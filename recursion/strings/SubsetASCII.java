package strings;

import java.util.ArrayList;

public class SubsetASCII {
    public static void main(String[] args) {
        System.out.println(subsetASCII("","abc"));
    }

    static ArrayList<String> subsetASCII(String p , String un){
        if(un.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = un.charAt(0);
        ArrayList<String> left = subsetASCII(p+ch,un.substring(1));
        ArrayList<String> mid =subsetASCII(p+ (ch+0),un.substring(1));
        ArrayList<String> right =subsetASCII(p,un.substring(1));

        left.addAll(mid);
        left.addAll(right);

        return left;
    }
}
