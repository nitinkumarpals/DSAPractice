package practice;
import java.util.*;
public class insertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1000];
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=1; i<n; i++) {
			for(int j=i; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					int temp  = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else break;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
