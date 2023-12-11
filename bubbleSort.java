package practice;

public class bubbleSort {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			boolean swapped = false;
			for(int j=arr.length-2-i; j>=0; j--) {
				if(arr[j]>arr[j+1]) {
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,1,4,6,7,2};
		bubbleSort(arr);
		printArray(arr);
	}

}
