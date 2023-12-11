package practice;

public class N_numbers_recursion {
	
	public static void main(String[] args) {
		int n = 8;
		print(n);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		print(n-1);
	}
}
