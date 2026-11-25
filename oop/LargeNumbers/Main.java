package LargeNumbers;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(345333222);
        BigInteger C = new BigInteger("12332222222222222224444");

        BigInteger D = BigInteger.TEN;

        BigInteger s = A.add(B);
        BigInteger f = C.multiply(B);
        System.out.println(s);
        System.out.println(C);
        System.out.println(f);

        if(C.compareTo(A) >0){
            System.out.println("C is bigger");
        }

        System.out.println(FactorialBigInteger.fact(89));
    }
}


