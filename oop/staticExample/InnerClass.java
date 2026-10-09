package staticExample;

//Outsides classes can't be static
public class InnerClass {
    //Inner classes can be static
    //Test class is dependent on other class
    static class Test {

        String name;

        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
//        Test a = new Test("Shivam");  --> this will throw error if class not static
        Test a = new Test("Shivam");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
    }
}

//static class A{
//
//} -> will throw error
