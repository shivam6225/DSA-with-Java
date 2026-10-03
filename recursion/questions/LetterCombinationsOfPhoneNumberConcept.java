package questions;

import java.util.ArrayList;

public class LetterCombinationsOfPhoneNumberConcept {

    public static void main(String[] args) {
        System.out.println(letterCombinations("","12"));

        System.out.println(letterCombinationsCount("","123"));
    }

    static ArrayList<String> letterCombinations(String p , String un){
        if(un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = un.charAt(0) -'0'; // Convert '2 to 2
        ArrayList<String> list = new ArrayList<>();

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            list.addAll(letterCombinations(p+ch,un.substring(1)));
        }

        return list;
    }

    static int letterCombinationsCount(String p , String un){
        if(un.isEmpty()){
            return 1;
        }

        int digit = un.charAt(0) -'0'; // Convert '2 to 2
        ArrayList<String> list = new ArrayList<>();
        int count=0;
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            count+=(letterCombinationsCount(p+ch,un.substring(1)));
        }

        return count;
    }
}
