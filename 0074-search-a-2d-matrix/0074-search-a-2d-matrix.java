class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int row_index=0,col_index=0, start=0, end=n*m-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            row_index = mid/m;
            col_index = mid%m;
            if(matrix[row_index][col_index]==target){
                return true;
            }
            else if(matrix[row_index][col_index]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}