package practice;

public class selectionSort {
	
	public static void selectionsort(int [] arr) {
		//for outer loop from 0 to n-1
		for(int i=0; i<arr.length-1; i++) {
			int minPos=i;
			//for unsorted part of array
			for(int j= i+1; j<arr.length;j++) {
				if(arr[minPos]>arr[j]) {
					minPos = j;
				}
			}
			//swap
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
//			arr[minPos] = arr[minPos]+arr[i];
//			arr[i] = arr[minPos]-arr[i];
//			arr[minPos] = arr[minPos]-arr[i];
//			
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
	public static void main(String[] args) {
		int[] arr = {5,1,4,6,7,2};
		selectionsort(arr);
		printArray(arr);
	}
	

}
