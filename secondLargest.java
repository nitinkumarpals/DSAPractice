package practice;

public class secondLargest {
	
	public static int print2largest(int arr[], int n) {
	        // code here
	        int largest = -1;
	        int ans = -1;
	        for(int i=0; i<n; i++){
	            if(arr[i]>largest){
	                largest = arr[i];
	            }
	        }
	        for(int i=0; i<n; i++){
	            if(arr[i]!=largest){
	                ans = Math.max(ans,arr[i]);
	            }
	        }
	        return ans;
	    }
	 
	public static void main(String[] args) {
		int n = 6 ;
		int arr[] = {5,6,90,78,13,15};
		System.out.println(print2largest(arr, n));

	}
	

}
