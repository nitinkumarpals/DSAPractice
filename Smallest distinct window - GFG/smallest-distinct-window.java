//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String str) {
        // Your code goes here
        int[] count = new int[256];
        int first=0,second=0,len=str.length(),diff=0;
        
        //Calculate all the unique char
        while(first<str.length()){
            if(count[str.charAt(first)]==0){
                diff++;
            }
            count[str.charAt(first)]++;
            first++;
        }
        //make all value of count array 0 again
        first=0;
        for(int i=0; i<256;i++){
            count[i]=0;
        }
        while(second<str.length()){
            //while diff exist
            while(diff>0 && second<str.length()){
                if(count[str.charAt(second)]==0){
                    diff--;
                }
                count[str.charAt(second)]++;
                second++;
            }
            len = Math.min(len,second-first);
            //while diff does not become 1
            while(diff!=1){
            len = Math.min(len,second-first);
            count[str.charAt(first)]--;
            
            if(count[str.charAt(first)]==0){
                diff++;
            }
            first++;
            }
        }
        return len;
    }
}