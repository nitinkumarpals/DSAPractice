package practice;

public class PrintArrayRecursion {

	public static void print(int arr[], int index) {
		if(index==-1) {
			return ;
		}
		print(arr,index-1);
		System.out.println(arr[index]);
	}
	public static void main(String[] args) {
		
		int arr[] = {3,4,1,2,8};
		print(arr,4);
	}

}
