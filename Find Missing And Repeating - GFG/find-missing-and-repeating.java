//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        //Decrease value by 1
        for(int i=0; i<n; i++){
            arr[i]--;
        }
        
        //Set Occurance
        for(int i=0; i<n; i++){
            arr[arr[i]%n]+=n;
        }
        
        int[] ans = new int[2];

        for(int i=0; i<n; i++){
            //Missing
            if(arr[i]/n==0){
                ans[1]=i+1;
            }
            //repeating
            else if(arr[i]/n==2){
                ans[0]=i+1;
            }
        }
        return ans;
    }
}