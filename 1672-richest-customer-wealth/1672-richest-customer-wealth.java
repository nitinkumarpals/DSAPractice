class Solution {
    public int maximumWealth(int[][] accounts) {
        int count = 0;
        for(int i = 0; i<accounts.length; i++){
            int localCount = 0;
            for(int j=0; j<accounts[i].length; j++){
                 localCount += accounts[i][j];
            }
            if(count<localCount){
                count = localCount;
            }
        }
        return count;
    }
}