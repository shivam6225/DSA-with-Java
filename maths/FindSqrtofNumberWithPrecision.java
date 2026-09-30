public class FindSqrtofNumberWithPrecision {

    public static void main(String[] args) {
        int N = 40;
        int precision = 3;
        System.out.println(sqrt(N,precision));
    }
    //Time:O(logN)
    static double sqrt(int N,int p){
        int start = 0;
        int end = N;
        double root =0.0;

        while(start<=end){
            int mid = start + (end-start)/2;

            int res = mid*mid;

            if(res>N) end = mid-1;
            else if(res<N) start = mid+1;
            else {
                //perfect root
                return mid;
            }
        }

        double incr =0.1;
        root=end;
        for (int i = 0; i < p; i++) {
            while(root*root <= N){
                root += incr;
            }
            root-=incr;
            incr/=10;
        }

        return root;
    }
}
