package practice;

public class rotatedArray {


	    public static int findMin(int[] nums) {
	        int ans = nums[0], start=0, end=nums.length-1;
	        while(start<=end){
	            int mid = start+(end-start)/2;
	            //Left Side Sorted
	            if(nums[mid]>=nums[0]){
	                start = mid+1;
	            }
	            //Right side sorted
	            else{
	                ans =  nums[mid];
	                end = mid-1;
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,1,4,6,7,2};
		System.out.println(findMin(arr));
		

	}

}
