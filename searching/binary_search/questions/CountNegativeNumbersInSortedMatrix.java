package binary_search.questions;

public class CountNegativeNumbersInSortedMatrix {

        public int countNegatives(int[][] grid) {
            int count = 0;
            int n = grid[0].length;
            for(int i=0;i<grid.length;i++)
            {
                count+=(n-binarySearch(grid,i,0,n-1));
            }

            return count;

        }

        public int binarySearch(int[][] arr , int row , int start , int end){
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[row][mid]>=0) start = mid+1;
                if(arr[row][mid]<0) end = mid -1;
            }

            return start;
        }
}
