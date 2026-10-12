package AbstractClasses;

//Parent needs to be abstract if it has abstract method
//abstract class can't be final
public abstract class Parent {

    int age;

    //abstract constructor is not possible
    public Parent(int age) {
        this.age = age;
    }

    //We can't create abstract static method as they need to be overridden
    abstract void career(String name);

    abstract void partner (String name , int age);

    static void hello(){
        System.out.println("Hello");
    }
}
