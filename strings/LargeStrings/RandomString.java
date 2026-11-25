package LargeStrings;

import java.util.Random;

public class RandomString {

    static String generate(int size){
        // 97 -'a' , generate random int , convert to char , append
        //take random from 0 to 26
        StringBuffer buffer = new StringBuffer();

        Random random = new Random();

        for(int i=0;i<size;i++){
            int randomChar = 97+ (int)(random.nextFloat()*26);
            buffer.append((char)randomChar);
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate(100));
    }
}
