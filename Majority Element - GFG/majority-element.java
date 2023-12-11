//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int n)
    {
        // your code here
          int candidate=0, count=0;
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
        count=0;
        //veryfy if candidate has more than n/2 votes
        for(int i=0; i<n; i++){
            if(nums[i]==candidate){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }
        else return -1;
    }
}