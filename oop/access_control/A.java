package access_control;

public class A {
    //public : can be used everywhere
    //private : can be used only in class
    //protected ; can be used in package and the subclasses
    //no modified : only in the same package

    protected int num;
    //Default Access Modifier
    //Allowed in same package
    //Disallowed in different package
    String name;
    int[] arr;


    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    //Getter
    public int getNum() {
        return num;
    }

    //Setter
    public void setNum(int num) {
        this.num = num;
    }
}
