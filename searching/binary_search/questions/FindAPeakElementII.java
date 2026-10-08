package binary_search.questions;

public class FindAPeakElementII {

        public int[] findPeakGrid(int[][] mat) {
            int row = mat.length;
            int col = mat[0].length;
            int sCol =0;
            int eCol = col -1;

            while(sCol<=eCol){
                int mid = sCol+ (eCol-sCol)/2;

                int maxRow = 0;

                for(int i=0;i<row;i++){
                    if(mat[i][mid] >= mat[maxRow][mid]){
                        maxRow = i;
                    }
                }

                boolean left = false;
                boolean right = false;

                if(mid-1>=sCol){
                    left = mat[maxRow][mid]<mat[maxRow][mid-1];
                }

                if(mid+1<=eCol){
                    right = mat[maxRow][mid]<mat[maxRow][mid+1];
                }

                if(!left && !right){
                    return new int[]{maxRow,mid};
                }
                else if (right) {
                    sCol = mid + 1;
                }
                else {
                    eCol = mid - 1;
                }

            }

            return new int[] {-1,-1};
        }
}
