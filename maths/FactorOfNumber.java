import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class FactorOfNumber {
    public static void main(String[] args) {
        int N = 36;
        factor1(N);
        System.out.println();
        factor2(N);
        System.out.println();
        factor3(N);
    }

    //Time : O(N)
    //Straight Forward Loop
    private static void factor1(int n) {

        for (int i = 1; i <=n; i++) {
            if(n%i==0) {
                System.out.print(i+" ");
            }
        }
    }

    //Time: O(sqrt(N))
    private static void factor2(int n) {

        for (int i = 1; i*i <=n; i++) {
            if(n%i==0) {
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else System.out.print(i+" "+n/i+" ");
            }
        }


    }

    // print in sorted order
    //Time : O(sqrt(N))
    //Space : O(sqrt(N))
    private static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <=n; i++) {
            if(n%i==0) {
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() -1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }


    }


}
