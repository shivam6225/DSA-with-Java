package LargeNumbers;

import java.math.BigDecimal;

public class BigDecimalExamples {

    public static void main(String[] args) {
        BigDecimal A = new BigDecimal("0.03");
        BigDecimal B = new BigDecimal("0.04");

        System.out.println(A.subtract(B));

        BigDecimal a = new BigDecimal("44555555.4444444");
        BigDecimal b = new BigDecimal("22334.449");

        //operations
        System.out.println(a.add(b));
        //System.out.println(a.divide(b));
        System.out.println(a.multiply(b));
        System.out.println(b.negate());

    }
}
