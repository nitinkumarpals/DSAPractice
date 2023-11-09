class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0, count=0, n=nums.length;
        for(int i=0; i<n; i++){
            if(count==0){
                count=1;
                candidate=nums[i];
            }
            else {
                if(candidate==nums[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return candidate;
    }
}