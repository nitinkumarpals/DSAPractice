package practice;

public class MinElementInArrayRecursion {

	public static void main(String[] args) {
		
		int[] arr = {3,4,1,2,8};
		System.out.println(minElement(arr,0,5));
	}
	public static int minElement(int[] arr, int index, int n) {
		if(index==n-1) {
			return arr[index];
		}
		return Math.min(arr[index], minElement(arr,index+1,n));
	}
	

}
