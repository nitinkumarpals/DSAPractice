package practice;

public class largestAndSmallestInArray {
	
	public static void main(String[] args) {
		int arr[] = {1,4,6,12,5,9,10,7};
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest number is "+smallest+" and largest number is "+largest);
	}

}
