package practice;
import java.util.*;
public class prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in array");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(divide(arr));

	}
	public static boolean divide(int[] arr) {
		int totalSum=0;
		int prefix=0;
		for(int i=0;i<arr.length; i++) {
			totalSum+=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			prefix+=arr[i];
			if(totalSum-prefix==prefix) {
				return true;
			}
		}
		return false;
		
	}
	

}
