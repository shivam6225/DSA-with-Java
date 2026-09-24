public class PrettyPrinting {

    public static void main(String[] args) {
        //Till two digit decimal number

        float a = 453.1274f;
        //f is formatter String
        //Rounds off as well
        System.out.printf("Formatted Number is %.2f",a);
        System.out.println();
        System.out.printf("Pie : %.3f",Math.PI);
        System.out.println();
        //Order is maintained
        System.out.printf("hello my name is %s and I am %s","Kunal","cool");
    }
}
