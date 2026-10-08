package binary_search.questions;

public class SearchA2DMatrix {

        public boolean searchMatrix(int[][] matrix, int target) {
            return binarySearchMatrix(matrix,target);
        }

        public boolean binarySearch(int[][] arr , int row , int start , int end , int target){
            while(start<=end){
                int mid = start + (end - start)/2;
                if(arr[row][mid]==target){
                    return true;
                }
                else if(arr[row][mid]>target){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }

            return false;
        }

        public boolean binarySearchMatrix(int[][] arr , int target){
            if(arr.length==0 || arr[0].length==0){
                return false;
            }
            int row = arr.length;
            int col = arr[0].length;
            if(arr.length==1) {
                return binarySearch(arr,0,0,col-1,target);
            }
            int rowStart = 0;
            int rowEnd = row -1;
            int colMid = col/2;
            while(rowStart<rowEnd-1){
                int mid = rowStart + (rowEnd-rowStart)/2;
                if(arr[mid][colMid]==target) return true;
                else if(arr[mid][colMid]>target){
                    rowEnd = mid;
                }
                else {
                    rowStart = mid;
                }
            }

            //Check whether middle element is target
            if(arr[rowStart][colMid]==target || arr[rowStart+1][colMid]==target) {
                return true;
            }


            // return binarySearch(arr,rowStart+1,0,col-1,target) || binarySearch(arr,rowStart,0,col-1,target);


            //Search in 1st half of 1st row
            if(colMid>0 && target<=arr[rowStart][colMid-1]){
                return binarySearch(arr,rowStart,0,colMid-1,target);
            }
            //Search in 2nd half of 1st row
            else if(colMid<col-1 && target>=arr[rowStart][colMid+1] && target<=arr[rowStart][col-1]){
                return binarySearch(arr,rowStart,colMid+1,col-1,target);
            }
            //Search in 1st half of 2nd row
            else if(colMid>0 && target<=arr[rowStart+1][colMid-1]){
                return binarySearch(arr,rowStart+1,0,colMid-1,target);
            }
            else{
                if(colMid<col-1)
                    return binarySearch(arr,rowStart+1,colMid+1,col-1,target);
                return false;
            }
        }
}
