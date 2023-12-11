class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=0, end=0, n=piles.length, ans=0;
        long sum=0;
        for(int i=0; i<n; i++){
                sum+=piles[i];
            end = Math.max(end,piles[i]);
        }
             start=(int)(sum/h);
             if(start<1){
                 start=1;
             }
        while(start<=end){
             int mid = start+(end-start)/2;
             //mid amount of bananas to consume in 1 hour
             int totalTime=0;
             for(int i=0; i<n; i++){
                 totalTime+=piles[i]/mid;
                 if(piles[i]%mid != 0){
                     totalTime++; 
                 }
             }//end of for
             if(totalTime>h){
                 start= mid+1;
             }
             else{
                 ans = mid;
                 end = mid-1;
             }

        }//end of while
        return ans;
    }//end of function
}