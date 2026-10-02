package strings;

public class RemoveCharOrSubStringFromString {

    public static void main(String[] args) {
        skip("","bacccdah");

        System.out.println(skip2("baaddgahhah"));

        System.out.println(skipSubString("bapplecdgappledef"));

        System.out.println(skipSubString2("bapplecdgappdef"));
    }

    static void skip(String p, String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = un.charAt(0);
        if(ch=='a'){
            skip(p,un.substring(1));
        }
        else{
            skip(p+ch,un.substring(1));
        }
    }

    static String skip2(String un){
        if(un.isEmpty()){
            return "";
        }

        char ch = un.charAt(0);
        if(ch=='a'){
            return skip2(un.substring(1));
        }
        else{
            return ch + skip2(un.substring(1));
        }
    }


    static String skipSubString(String un){
        if(un.isEmpty()){
            return "";
        }

        if(un.startsWith("apple")){
            return skipSubString(un.substring(5));
        }
        else{
            return un.charAt(0) + skipSubString(un.substring(1));
        }
    }

    //skip app when it is not apple
    static String skipSubString2(String un){
        if(un.isEmpty()){
            return "";
        }

        if(un.startsWith("app") && !un.startsWith("apple")){
            return skipSubString2(un.substring(3));
        }
        else{
            return un.charAt(0) + skipSubString2(un.substring(1));
        }
    }




}
