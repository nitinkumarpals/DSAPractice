package practice;

public class OneToN_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		print(n);
	}

	public static void print(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println(n);
			return;
		}
		print(n-1);
		System.out.println(n);
	}

}
