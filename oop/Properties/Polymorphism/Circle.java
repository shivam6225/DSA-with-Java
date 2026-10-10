package Properties.Polymorphism;

public class Circle extends Shapes{
    //Method overriding
    //@Override is annotation
    //It verifies in checking if method is overridden
    //It simply gives error is method is not overridden
    @Override
    void area(){
        System.out.println("Area is pi*r*r");
    }
}
