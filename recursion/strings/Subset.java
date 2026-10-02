package strings;

public class Subset {

    public static void main(String[] args) {
        String cd = "abcd";
        subset("",cd);
    }

    //using processed arguments
    static void subset(String p,String un){
        if(un.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = un.charAt(0);
        subset(p+ch,un.substring(1));
        subset(p,un.substring(1));
    }
}
