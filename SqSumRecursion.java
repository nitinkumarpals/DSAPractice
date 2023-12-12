package practice;

public class SqSumRecursion {

	public static void main(String[] args) {

		int n = 5;
		System.out.println(sqSum(n));
	}
	public static int sqSum(int n) {
		if(n==1) {
			return 1;
		}
		return n*n+sqSum(n-1);
	}

}
