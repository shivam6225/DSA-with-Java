package Properties.Polymorphism;

public class Square extends Shapes{
    //this will run when object of Square is created
    //It's overriding the parent method
    @Override
    void area(){
        System.out.println("Area is side*side");
    }
}
