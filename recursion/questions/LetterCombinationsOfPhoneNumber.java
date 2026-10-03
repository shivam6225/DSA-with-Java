package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {

        public Map<Character , String> letters = Map.of(
                '2',
                "abc",
                '3',
                "def",
                '4',
                "ghi",
                '5',
                "jkl",
                '6',
                "mno",
                '7',
                "pqrs",
                '8',
                "tuv",
                '9',
                "wxyz"
        );
        public List<String> letterCombinations(String digits) {

            return combinationRec("",digits);
        }

        public List<String> combinationRec(String p , String un){
            if(un.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            char digit = un.charAt(0);

            String digitValue = letters.get(digit);

            char firstChar = digitValue.charAt(0);
            ArrayList<String> list = new ArrayList<>();

            for(int i=0;i<digitValue.length();i++){
                char ch = (char)(firstChar+i);
                list.addAll(combinationRec(p+ch,un.substring(1)));
            }

            return list;
        }
}
