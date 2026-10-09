package ClassMain;

public class Student {
    int rno;
    String name;
    float marks;
    //this keyword -> points to the Object reference internally

    //Constructor Overloading
    Student(){
        this (13,"default_person",100.0f);
    }
    Student(int rno,String name,float marks) {
        System.out.println("Constructor is called");
        this.rno =rno;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("Hello! My name is "+ this.name);
    }

    void changeName(String name){
        this.name = name;
    }
}
