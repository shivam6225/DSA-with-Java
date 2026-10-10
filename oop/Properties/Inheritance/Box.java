package Properties.Inheritance;
//final can be used to prevent Inheritance too
//whenever class is put at final
//It implicitly declares all methods as final
public class Box {

    double length;
    double height;
    double width;

    //Static methods can be inherited
    //They can't be Overridden
    static void greeting(){
        System.out.println("Hey , I am in box class.Greetings!!");
    }

    //Method Overloading -> Static Polymorphism or Compile Time Polymorphism
    //Constructor of multiple type are type of Static Polymorphism
    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    //cube
    Box(double side) {
        this.width = side;
        this.length = side;
        this.height = side;
    }


    Box(double length, double height, double width) {
        super(); // even base class can use object class
        //every single class inherits object class
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(Box old){
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
