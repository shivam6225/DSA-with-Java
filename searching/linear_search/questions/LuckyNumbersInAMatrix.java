package linear_search.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class LuckyNumbersInAMatrix {

        public List<Integer> luckyNumbers(int[][] matrix) {

            int rowMinMax = Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++){
                int temp = Integer.MAX_VALUE;
                for(int j=0;j<matrix[0].length;j++){
                    temp = Math.min(matrix[i][j],temp);
                }
                rowMinMax = Math.max(rowMinMax,temp);
            }

            int colMaxMin = Integer.MAX_VALUE;
            for(int i=0;i<matrix[0].length;i++){
                int temp = Integer.MIN_VALUE;
                for(int j=0;j<matrix.length;j++){
                    temp = Math.max(matrix[j][i],temp);
                }
                colMaxMin = Math.min(colMaxMin,temp);
            }

            if ( rowMinMax == colMaxMin ){
                return new ArrayList<>(Arrays.asList(rowMinMax));
            }


            return new ArrayList<>();
        }
}
