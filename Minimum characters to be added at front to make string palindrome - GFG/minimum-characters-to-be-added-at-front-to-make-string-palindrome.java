//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    public static int minChar(String str) {
       //Write your code here
       //String reverse
       StringBuilder rev = new StringBuilder(str);
       rev.reverse();
       int size = str.length();//old size
       str+='$';//separator
       str+=rev.toString();//Reverse
       
       //have to find longest prefix
       int [] lps = new int[str.length()];
       int pre=0,suf=1;
       
       while(suf<str.length()){
           //Matched
           if(str.charAt(pre)==str.charAt(suf)){
               lps[suf]=pre+1;
               pre++;
               suf++;
           }
           //Not Matched
           else{
               if(pre==0){
                   lps[suf]=0;
                   suf++;
               }
               else{
                   pre=lps[pre-1];
               }
           }
       }
       //Answer
       return size-lps[str.length()-1];
       
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main(String[] args) throws IOException
	{
	    var sc = new FastReader();
	    int test = sc.nextInt();
	    while(test-->0){
    		String s = sc.nextString();
    		System.out.println(Solution.minChar(s));
	    }
	}
    
    public static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		private void read() throws IOException
		{
			st = new StringTokenizer(br.readLine());
		}

		public String nextString() throws IOException
		{
			while(!st.hasMoreTokens())
				read();
			return st.nextToken();
		}

		public int nextInt() throws IOException
		{
			return Integer.parseInt(nextString());
		}

		public long nextLong() throws IOException
		{
			return Long.parseLong(nextString());
		}
	}
}
// } Driver Code Ends