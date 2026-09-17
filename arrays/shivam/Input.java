package shivam;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //Array of primitives
        int [] arr = new int[5];
        arr[0] = 23;
        arr[1] =45;
        arr[2] =233;
        arr[3]=543;
        arr[4] =3;
        //[23,45,233,543,3]
        System.out.println(arr[3]);

        //input using for loops
        //length -> length of the array
        for(int i=0; i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        //print array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        //for( datatype : reference variable) num-> represent element of the array

        for(int num:arr){
            System.out.print(num+" ");
        }

        // System.out.println(arr[5]); Index out of bound error

        //Easy way to print
        //toString uses stringbuilder to create this string
        System.out.println(Arrays.toString(arr));

        //Array of Objects
        String[] str  = new String[4];

        for(int i=0;i<4;i++){
            str[i]=input.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
