package com.Shivam;

public class Primitives {
    public static void main(String[] args) {
        //Primitive data types are the basic data types in Java.
        //They can't be broken down into smaller data types.

        int rollNo = 23; //Integer data type
        char letter = 'A'; //Character data type
        //Values are not accurate in floating point data types. 
        //So, we need to use float or double data types for decimal values.
        float marks = 98.67f; //Floating point data type
        //We need to add f at the end of the value to indicate that it is a float value
        //All decimal values are considered as double by default in Java.
        double largeDecimalNumber = 123456789.123456789; //Double data type
        long largeIntegerNumber = 1234567890123456789L; //Long data type
        //We need to add L at the end of the value to indicate that it is a long value
        //All integer values are considered as int by default in Java.
        boolean checked = true; //Boolean data type (true or false)
        byte smallIntegerNumber = 127; //Byte data type (1 byte)
        short smallIntegerNumber2 = 32767; //Short data type (2 bytes)
        
        
        //Maximum size of primitive data types in Java
        //Int: 4 bytes
        //Char: 2 bytes
        //Float: 4 bytes
        //Double: 8 bytes   
        //Long: 8 bytes
        //Boolean: 1 bit

        //We can also use wrapper classes to convert primitive data types into objects.
        Integer rollNoWrapper = rollNo; //Integer wrapper class
        Character letterWrapper = letter; //Character wrapper class 
        Float marksWrapper = marks; //Float wrapper class
        Double largeDecimalNumberWrapper = largeDecimalNumber; //Double wrapper class
        Long largeIntegerNumberWrapper = largeIntegerNumber; //Long wrapper class
        Boolean checkedWrapper = checked; //Boolean wrapper class
        //This is useful to get additional methods and functionalities to the primitive data types.
        //Automatic conversion of primitive data types to wrapper classes is called autoboxing.
        //Automatic conversion of wrapper classes to primitive data types is called unboxing.

        int a = 10;
        //Here a is literal value of int data type. We can also use wrapper classes to convert literal values into objects.

        //int a = 234_000_000;
        //We can use underscore to make the number more readable. It will not affect the value of the number.
        //It will replace with comma in the number. For example, 234_000_000 will be treated as 234,000,000.
    }
}