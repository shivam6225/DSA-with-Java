package Generics.comparing;

public class Student implements Comparable<Student> {

    int rollno;
    float marks;


    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        int diff  =(int) (this.marks - o.marks);
        //If diff ==0 , means both are 0
        //if diff < 0, means o is bigger else o is smaller
        return diff;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
