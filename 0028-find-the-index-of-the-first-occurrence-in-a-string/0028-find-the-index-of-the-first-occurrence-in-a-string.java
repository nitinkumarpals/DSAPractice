class Solution {
    public static void lpsfind(int[] lps, String s){
        int pre=0,suf=1;
        while(suf<s.length()){
            //Matching
            if(s.charAt(pre)==s.charAt(suf)){
                lps[suf]=pre+1;
                suf++;
                pre++;
            }
            //Not matching
            else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre = lps[pre-1];
                }
            }
        }
    }
    public int strStr(String haystack, String needle) {
        int[] lps = new int[needle.length()];
        lpsfind(lps,needle);

        int first=0, second=0;
        while(first<haystack.length() && second<needle.length()){
            //Matched
            if(haystack.charAt(first)==needle.charAt(second)){
                first++;
                second++;
            }
            //Not Matched
            else{
                if(second==0){
                    first++;
                }
                else{
                    second=lps[second-1];
                }
            }
            if(second==needle.length()){
                return first-second;
            }
        }
        return -1;
    }
}