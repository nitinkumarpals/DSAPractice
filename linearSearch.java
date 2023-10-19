package practice;

public class linearSearch {
	public static int linearsearch(int num[], int key) {
		for(int i=0; i<num.length; i++) {
			if(num[i]==key) {
				return i;
			}
		}
		return -1;
				
	}
	public static int linearSearchString(String numbers[], String keys) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==keys) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int num[] = {2,4,5,3,1,2,6,11,34,10};
		int key = 113;
		String[]numbers = {"first","second","third","fourth","fifth"};
		String keys = "fourth";
		
		int foundAt = linearSearchString(numbers, keys);
		if(foundAt==-1) {
			System.out.println("key if strings not found");

		}
		else {
			System.out.println("Key of string is at index "+ foundAt);
		}
		int index = linearsearch(num, key);
		if(index == -1) {
			System.out.println("key of numbers not found");
		}
		else {
			System.out.println("Key of numbers is at index "+ index);
		}
	}
}
