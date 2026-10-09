package staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age; //Instance Variable
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1; //No need to use object reference to manipulate it
    }

    static void message(){
        System.out.println("This is static method in Human Class");
        //System.out.println(this.age); -> can't use this keyword in static object
    }


    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }
}
