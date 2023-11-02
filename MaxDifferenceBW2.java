package practice;

public class MaxDifferenceBW2 {
	
	public static int maxdiff(int arr[], int n) {
		int suffix = arr[n-1];
		int ans =0;
		for(int i=n-2; i>=0; i--) {
			 ans = Math.max(ans, suffix-arr[i]);
			suffix = Math.max(arr[i], suffix);

		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {80,2,6,3,100};
		int n = arr.length;
		System.out.println("Maximum difference is "+maxdiff(arr,n));

	}

}
