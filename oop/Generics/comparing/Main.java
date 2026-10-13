package Generics.comparing;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student shivam = new Student(12,89.45f);
        Student kunal = new Student(5,99.52f);

        Student arpit = new Student(4,95.53f);
        Student karan = new Student(13,94.4f);

        Student[] list = {shivam , kunal , arpit , karan};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));


        if(shivam.compareTo(kunal) < 0) {
            System.out.println(shivam.compareTo(kunal));
            System.out.println("Kunal has more marks");
        }

    }
}
