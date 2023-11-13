class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)]++;
        }
        int count=0,odd=0;
        for(int i=0; i<128; i++){
            if(arr[i]%2==0){
                count+=arr[i];
            }
            else{
                count+=arr[i]-1;
                odd=1;
            }
        }
        return count+odd;
    }
}