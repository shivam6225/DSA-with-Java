package interfaces.nested;

public class A {

    //nested interface
    //It can be declared as private , public and protected unlike the default interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}


