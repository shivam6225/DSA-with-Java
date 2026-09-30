public class GCD_LCM {
    public static void main(String[] args) {
        int a = 36 ;
        int b = 24;

        System.out.println("HCF is: "+gcd(a,b));
        System.out.println("LCM is: "+lcm(a,b));

    }

    //Calculate GCD or HCF of Two Numbers
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    //a*b = fd*gd = d(f*gd) = HCF(f*gd) = HCF*LCM
    static int lcm(int a , int b){
        return (a*b)/gcd(a,b);
    }


}
