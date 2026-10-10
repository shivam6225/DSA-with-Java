package Properties.Polymorphism;
//Poly - Many
//Morphism - Ways to Represent
//Occurs in Inheritance

//Compile Time/Static -> Java determines which method to call during compile time
public class Main {

    public static void main(String[] args) {
        //Runtime polymorphism
        //Dynamic Polymorphism
        //Achieved by Method Overriding -> Overriding happens during Inheritance
        //Late Binding
        Shapes shape  = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square(); //Upcasting

        shape.area();
        circle.area();
        square.area();
    }
}
