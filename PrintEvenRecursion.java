package practice;

public class PrintEvenRecursion {

	public static void main(String[] args) {
//		print(2,9);
		int n = 11;
		if(n%2==1) {
			n--;
		}
		printEven(n);
	}

	public static void printEven(int n) {
		if(n==2) {
			System.out.println(n);
			return;
		}
		printEven(n-2);
		System.out.println(n);
	}

//	private static void print(int num, int n) {
//		// TODO Auto-generated method stub
//		if(num>n) {
//			return;
//		}
//		print(num+2,n);
//
//		System.out.println(num);
//	}

}
