class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int top=0, bottom=row-1, right=col-1, left=0;
        ArrayList<Integer> ans = new ArrayList();
        while(left<=right && top<=bottom){
            //print top
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //print right
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //print bottom
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                ans.add(matrix[bottom][i]);
            }
             bottom--;

            }
            //print left
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                ans.add(matrix[i][left]);
            }
            left++;
            }
        }
        return ans;
    }
}