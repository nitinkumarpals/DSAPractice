package practice;
import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int[] arr = new int[1000];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<=n-1; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println(arr[n-1]);
	}

}
