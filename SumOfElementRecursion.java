package practice;

public class SumOfElementRecursion {

	public static void main(String[] args) {

		int arr[] = {3,4,1,2,8};
		System.out.println(sum(arr,0,5));
	}
	public static int sum(int[] arr,int index, int n) {
		if(index==n) {
			return 0;
		}
		return arr[index]+sum(arr,index+1,n);
	}

}
