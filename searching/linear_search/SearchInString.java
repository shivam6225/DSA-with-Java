package linear_search;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Shivam";
        char target = 'i';
        System.out.println("Is character present in string: "+ search2(name,target));
    }

    static boolean search(String str,char target){

        if(str.length()==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if(target==str.charAt(i)){
                return true;
            }

        }

        return false;
    }

    static boolean search2(String str,char target){

        if(str.isEmpty()){
            return false;
        }

        //Convert String to Array for loop
        for(char ch:str.toCharArray()){
            if(target==ch){
                return true;
            }
        }

        return false;
    }
}
