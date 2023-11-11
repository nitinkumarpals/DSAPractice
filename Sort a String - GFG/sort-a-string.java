//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String sort(String s) {
        // code here
        int[] frequency = new int[26];
        for(char c: s.toCharArray()){
            frequency[c - 'a']++;
        }
        s="";
        for(int i=0; i<26; i++){
            char c = (char) ('a' + i);
            while(frequency[i]>0){
                s+=c;
                frequency[i]--;
            }
        }
        
        return s;
    }
} 