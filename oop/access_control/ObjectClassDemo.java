package access_control;

public class ObjectClassDemo {

    int num;
    float val;

    public ObjectClassDemo(int num,float val) {
        this.num = num;
        this.val  = val;
    }

    //A random unique number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //
    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClassDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClassDemo obj = new ObjectClassDemo(34,54.34f);
        ObjectClassDemo obj2 = new ObjectClassDemo(34,45.23f);
        ObjectClassDemo obj3 = new ObjectClassDemo(34,54.34f);

        if(obj == obj3){ // == whether these 2 variables are pointing to same object
            System.out.println("obj is equal to obj3");
        }

        if(obj.equals(obj3)){ // equals() check content of both
            System.out.println("obj is equal to obj3");
        }


        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj instanceof  Object);

        System.out.println(obj.getClass());



    }
}
