class Solution {
    public int climbStairs(int n) {
        int pre =1,post=1,current=0;
        if(n<=1){
            return 1;
        }
        for(int i=2; i<=n; i++){
            current = pre+post;
            post = pre;
            pre = current;
            
        }
        return current;

}
}