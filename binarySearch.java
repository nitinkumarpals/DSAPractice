package practice;
import java.util.*;
public class binarySearch {

	public static int bS(int[] arr, int n, int key) {
		int start = 0, end = arr.length-1, mid;
		while(start<=end) {
			mid = (start+end)/2;
			if(arr[mid]==key) {//found
				return mid;
			}
			else if(mid<key) {//right
				start = mid+1;
			}
			else {//left
				end = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [1000];
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Start adding elements");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		System.out.println("found at index "+ bS(arr,n,key));
		

	}

}
