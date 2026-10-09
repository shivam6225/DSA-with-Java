package ClassMain;

import static packages.Message.message;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(25,"Shivam",82.5f);
        //Student() -> constructor / special function
//        student1.rno = 25;
//        student1.name ="Shivam";
        System.out.println(student1);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
//        System.out.println(student1.salary);
        student1.greeting();
        student1.changeName("Kunal");
        student1.greeting();

        Student random = new Student(student1);

        System.out.println(random.name);

        Student random2 = new Student();

        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something";

        System.out.println(two.name);

        message();
    }
}




