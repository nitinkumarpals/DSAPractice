package practice;
import java.util.*;
import java.io.*;
public class ThePaintersPartitionProblem2 {

	public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }

}
class Solution{
    static long minTime(int[] arr,int n,int k){
        //code here
        long start=0, end=0,ans=0;
        for(int i=0; i<n; i++){
            start= Math.max(start,arr[i]);
            end+= arr[i];
        }
        
        while(start<=end){
            long mid = start+(end-start)/2;
            long pages=0, count=1;
            //check for pages fit in one student
            for(int i=0;i<n; i++){
                pages+=arr[i];
                if(pages>mid){
                    count++;
                    pages=arr[i];
                }
            }
            if(count<=k){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
