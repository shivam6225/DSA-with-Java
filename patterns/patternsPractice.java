import static java.lang.Math.abs;

public class patternsPractice {

    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern31(4);
    }

    static void pattern1(int n){
        for( int i=0;i<n;i++){
            //for every row, run the col
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            //new line after each row
            System.out.println();
        }
    }

    static void pattern2(int n){
        for( int i=0;i<n;i++){
            //for every row, run the col
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //new line after each row
            System.out.println();
        }
    }

    static void pattern3(int n){
        for( int i=0;i<n;i++){
            //for every row, run the col
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            //new line after each row
            System.out.println();
        }
    }

    static void pattern4(int n){
        for( int i=1;i<=n;i++){
            //for every row, run the col
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //new line after each row
            System.out.println();
        }
    }

    static void pattern5(int n){
        for( int i=1;i<((2*n));i++){
            //for every row, run the col
            int col = i;
            if(i>n-1) {
                col = 2*n-i ;
            }
            for (int j = 0; j < col ; j++) {
                System.out.print("*");
            }
            //new line after each row
            System.out.println();
        }
    }


    static void pattern28(int n){
        for( int i=0;i<2*n;i++){
            //for every row, run the col
            int col = i;
            if(i>n) {
                col = 2*n-i ;
            }
            int spaces = (n - col);
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col ; j++) {
                System.out.print("* ");
            }
            //new line after each row
            System.out.println();
        }
    }

    static void pattern30(int n){
        for( int i=1;i<=n;i++){
            //for every row, run the col
            int spaces = (n - i);
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
            for (int y = 2; y <= i ; y++) {
                System.out.print(y);
            }

            //new line after each row
            System.out.println();
        }
    }


    static void pattern17(int n){
        for( int i=1;i<=2*n;i++){
            //for every row, run the col
            int col = i;
            if(i>n){
                col = 2*n-i;
            }
            int spaces = (n - col);
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = col; j >= 1 ; j--) {
                System.out.print(j);
            }
            for (int y = 2; y <= col ; y++) {
                System.out.print(y);
            }

            //new line after each row
            System.out.println();
        }
    }



    static void pattern31(int n){
        for( int i=1;i<=2*n-1;i++){
            //for every row, run the col
            int row = i;
            if(row>n){
                row = 2*n -i;
            }
            for(int j=1;j<=2*n-1;j++){
                int col = j;
                if(col>n) col = 2*n -j;
                int idx = Math.min(row,col);
                System.out.print(n-idx+1+" ");
            }
            //new line after each row
            System.out.println();
        }
    }





}
