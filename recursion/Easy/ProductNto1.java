package Easy;

public class ProductNto1 {

    public static void main(String[] args){
        int n=6;
        System.out.println("Product of first N numbers: "+ product(n));
    }

    public static int product(int n){
        if(n==0) return 1;

        return n*product(n-1);
    }
}
