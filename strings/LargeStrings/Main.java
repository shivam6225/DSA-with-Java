package LargeStrings;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //constructor 1
        StringBuffer buffer = new StringBuffer();

        System.out.println(buffer.capacity());

        buffer.append("WeMakeDevs");

        buffer.insert(2,"Rahul");
        buffer.replace(1,5,"Shivam");
        buffer.delete(1,4);

        buffer.reverse();

        String str = buffer.toString();

        System.out.println(str);

        //constructor 2
        StringBuffer buffer2 = new StringBuffer("Shivam Pahariya");
        //constructor 3
        StringBuffer buffer3 = new StringBuffer(30);
        System.out.println(buffer3.capacity());

        //Removing white spaces

        String sentence = "  Hi this is Shivam training !! ";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));

        //split the string

        String arr=" Kunal Apporv Shivam Snehal Sahal  ";

        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df = new DecimalFormat("00.00000");

        System.out.println(df.format(7.222229));

    }
}
