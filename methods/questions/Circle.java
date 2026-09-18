package questions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = input.nextInt();

        double res_area = area(radius);

        double res_circum = circumference(radius);

        System.out.println("Area and Circumference of Circle are: "+ res_area + " "+ res_circum);

    }

    private static double circumference(double radius) {

        return (Math.PI)*(radius*radius);
    }

    private static double area(double radius) {

        return 2*(Math.PI)*radius;
    }
}
