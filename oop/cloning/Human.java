package cloning;

import java.util.Arrays;

public class Human implements Cloneable {

    int age ;
    String name;
    int[] arr ;

    public Human(Human other) {
        this.age =other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7};
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Object clone2() throws CloneNotSupportedException {
        //this is deep copy
        Human twin = (Human) super.clone();

        //make it deep copy
        twin.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
