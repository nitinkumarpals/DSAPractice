class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int e : nums){
             if(even(e)){
                 count++;
             }
        }
        return count;
    }
    public static boolean even(int num){
        int count = (int)Math.log10(num)+1;
        return count % 2 ==0;
    }
}