package practice;

public class EvenNumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 10;
			print(n);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		if(n==2) {
			System.out.println(2);
			return ;
		}
		System.out.println(n);
		print(n-2);
	}

}
