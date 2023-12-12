package practice;

public class FactorialRecursion {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		if(n==1|| n==0) {
			return 1;
		}
		return n*fact(n-1);
	}

}
