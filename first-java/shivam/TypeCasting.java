package shivam;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // Type casting is the process of converting one data type into another data
        // type.
        // There are two types of type casting in Java:
        // 1. Implicit type casting (Widening)
        // 2. Explicit type casting (Narrowing)

        Scanner input = new Scanner(System.in);
        float marks = input.nextFloat();
        // Here we are taking input from the user using Scanner class.
        // nextFloat() method is used to take input of float data type.
        System.out.println("Your marks are " + marks);
        // Suppose input is 45 , it will be stored in marks variable as 45.0 because
        // float data type can store decimal values.
        // This is an example of implicit type casting (widening) because float data
        // type is wider than int data type.

        int num = (int) (34.56f);
        // Here we are converting float data type into int data type.
        // This is an example of explicit type casting (narrowing) because int data type
        // is narrower than float data type.
        System.out.println("The value of num is " + num);
        // Suppose input is 34.56 , it will be stored in num variable as 34 because
        // int data type can only store whole numbers. The decimal part will be
        // truncated.

        // automatic type casting (widening) is done by the compiler automatically.
        int a = 257;
        byte b = (byte) a;
        // Here we are converting int data type into byte data type.
        // This is an example of explicit type casting (narrowing) because byte data
        // type
        // is narrower than int data type.
        System.out.println("The value of b is " + b);
        // Suppose input is 257 , it will be stored in b variable as 1
        // because byte data type can only store values from -128 to 127.
        // So, the value of 257 will be truncated to 1 because 257-256=1.
        // As it is out of range of byte data type, it will be wrapped around to the
        // range of byte data type.

        // byte a = 40;
        // byte b = 50;
        byte c = 100;
        int d = a * b / c;
        // Here we are performing arithmetic operations on byte data type.
        // This is an example of implicit type casting (widening) because int data type
        // is wider than byte data type.
        System.out.println("The value of d is " + d);
        // Suppose input is 40, 50 and 100 , it will be stored in d variable as 20
        // because (40*50)/100 = 2000/100 = 20.
        // How is it able to store 2000 in int data type when it is performing
        // arithmetic operations on byte data type?
        // This is because when we perform arithmetic operations on byte data type, it
        // is automatically converted
        // to int data type by the compiler. This is called automatic type casting
        // (widening).
        // So, the result of the arithmetic operation is stored in int data type.

        // byte b = 50;
        b = (byte) (b * 2);
        // Here we are performing arithmetic operations on byte data type.
        // This is an example of explicit type casting (narrowing) because byte data
        // type
        // is narrower than int data type.
        System.out.println("The value of b is " + b);
        // Suppose input is 50 , it will be stored in b variable as 100
        // because 50*2 = 100.
        // How is it able to store 100 in byte data type when it is performing
        // arithmetic operations on byte data type?
        // This is because when we perform arithmetic operations on byte data type, it
        // is automatically converted
        // to int data type by the compiler. This is called automatic type casting
        // (widening).
        // So, the result of the arithmetic operation is stored in int data type.
        // But we are trying to store it in byte data type which is narrower than int
        // data type.
        // So, we need to explicitly type cast it to byte data type. This is

        // Java follows unicode standard for character data type. It uses 2 bytes to
        // store a character.
        // So, it can store 65536 characters.
        // It can store characters from different languages and symbols. It can also
        // store emojis.

        // Type Promotion Rules in Java:
        // 1. All the byte, short and char values are promoted to int when they are used
        // in an expression.
        // 2. If any of the operands is long, the whole expression is promoted to long
        // 3. If any of the operands is float, the whole expression is promoted to float
        // 4. If any of the operands is double, the whole expression is promoted to
        // double

        System.out.println("The value of 5/2 is " + 5 / 2);
        // Here we are performing division operation on int data type.
        // The result will be 2 because both the operands are int data type and int data
        // type can only store whole numbers. The decimal part will be truncated.

        System.out.println("The value of 5.0/2 is " + 5.0 / 2);
        // Here we are performing division operation on double and int data type.
        // The result will be 2.5 because one of the operands is double data type

        // byte b = 42;
        // char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        // double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // Here we are performing arithmetic operations on different data types.
        // This is an example of implicit type casting (widening) because double data
        // type
        // is wider than float, byte, char and short data types.
        System.out.println("The value of result is " + result);
        // Suppose input is 42, 'a', 1024, 50000, 5.67 and 0.1234 , it will be stored in
        // result variable as 50000.0
        // because (5.67*42) + (50000/'a') - (0.1234*1024) = 238.14 + 515 - 126.3616 =
        // 626.7784
        // The result is stored in double data type because it is the widest data type
        // among all the operands.
        // Here a is promoted to int data type because it is used in an expression with
        // int data type.
        // Value of 'a' is 97 in unicode standard. So, 50000/'a' = 50000/97 =
        // 515.4639175257732
        // float + int - double = double
        // (f*b) = 238.14
        // (i/c) = 515
        // (d*s) = 126.3616
        // So, the final result is 238.14 + 515 - 126.3616 = 626.7784

        input.close();

    }
}
