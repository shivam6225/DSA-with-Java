package Properties.Inheritance;
//Multi-level inheritance
public class BoxWeight extends Box{

    double weight;

    //Static Methods can't be Overridden
    //@Override
    static void greeting(){
        System.out.println("Hey , I am in boxWeight class.Greetings!!");
    }


    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);  //call the parent class constructor
        //used to initialize Values present in parent class
        //To call the constructor of the object class
        //Private can't be access by child class directly
        //super.width -> will be able to access the base class width
        //Suppose both Base and Child have same attribute
        //this.weight -> child class
        //super.weight -> base class of child class
        //super() -> should be called first before the child class for initialization
        //If we don't use super() -> default for base class will be called
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);  //call the parent class constructor
        this.weight = weight;
    }



    public BoxWeight(BoxWeight other) {
        super(other);
        // will call the Box(Box old) -> copy constructor
        this.weight = other.weight;
    }
}
