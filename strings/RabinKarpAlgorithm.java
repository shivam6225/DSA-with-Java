import java.awt.*;

public class RabinKarpAlgorithm {

    public static void main(String[] args){
        search("shivamkunalrahul","kunal");
    }

    private static final int PRIME = 101;

    private static long calculateHash(String str){
        long hash =0;
        for(int i=0;i<str.length();i++){
            hash= (long) (hash+str.charAt(i)*Math.pow(PRIME,i));
        }
        return hash;
    }

    private static long updateHash(long prevHash , char oldChar , char newChar , int plen){
        long newhash = (prevHash - oldChar)/PRIME;
        newhash = (long) (newhash + newChar*Math.pow(PRIME,plen-1));

        return newhash;
    }

    public static void search(String text,String pattern){
        int plen = pattern.length();
        long phash = calculateHash(pattern);

        long thash = calculateHash(text.substring(0,plen));

        for (int i = 0; i <= text.length() - plen; i++) {
            if(thash==phash){
                if(text.substring(i,i+plen).equals(pattern)) {
                    System.out.println("Pattern Found at index "+ i);
                }
            }

            if(i < text.length()-plen){
                thash = updateHash(thash,text.charAt(i),text.charAt(i+plen) , plen);
            }
        }

    }
}
