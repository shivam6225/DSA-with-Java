package strings;

import java.util.ArrayList;

public class Subset {

    public static void main(String[] args) {
        String cd = "abcd";
        subset("",cd);
        System.out.println();
        System.out.println(subset2("","abcd"));
    }

    //using processed arguments
    //p -> processed
    //un -> unprocessed
    static void subset(String p,String un){
        if(un.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = un.charAt(0);
        subset(p+ch,un.substring(1));
        subset(p,un.substring(1));
    }

    static ArrayList<String> subset2(String p ,String un){
        if(un.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = un.charAt(0);
        ArrayList<String> left = subset2(p+ch,un.substring(1));
        ArrayList<String> right =subset2(p,un.substring(1));

        left.addAll(right);

        return left;
    }
}
