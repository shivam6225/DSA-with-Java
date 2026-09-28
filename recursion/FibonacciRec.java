public class FibonacciRec {

    public static void main(String[] args) {

        System.out.println(getFibonacci(6));
    }

    private static int getFibonacci(int n) {
        //Base Condition
//        if(n==0) return 0;
//        if(n==1) return 1;
        if(n<2) return n;
        //Recurrence Relation
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
