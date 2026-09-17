package questions;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of a circle");
        double r = input.nextDouble();
        double area = Math.pow(r, 2) * Math.PI;

        System.out.println("Area of Circle:" + area);

        System.out.println("Enter sides of Triangle");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        double s = (x + y + x) / 2;

        area = Math.sqrt(s * (s - x) * (s - y) * (s - z));

        System.out.println("Area of Triangle:" + area);

        System.out.println("Enter sides of Rectangle");
        double a = input.nextDouble();
        double b = input.nextDouble();

        area = a * b;

        System.out.println("Area of Rectangle:" + area);

        System.out.println("Enter base and height of Triangle");
        b = input.nextDouble();
        double h = input.nextDouble();

        area = b * h / 2;

        System.out.println("Area of Triangle:" + area);

        System.out.println("Enter base and height of Parallelogram");
        b = input.nextDouble();
        h = input.nextDouble();

        area = b * h;

        System.out.println("Area of Parallelogram:" + area);

        System.out.println("Enter sides of Rhombus");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();

        area = s1 * s2 / 2;

        System.out.println("Area of Rhombus:" + area);

        System.out.println("Enter side of Equilateral Triangle");
        double side = input.nextDouble();
        area = Math.sqrt(3) / 4 * Math.pow(side, 2);
        System.out.println("Area of Equilateral Triangle:" + area);

        input.close();
    }
}
