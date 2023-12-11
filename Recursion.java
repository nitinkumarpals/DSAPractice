package practice;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		print(n);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println("Happy Birthday");
			return ;
		}
		System.out.println(n+" days for birthday");
		print(n-1);
	}

}
