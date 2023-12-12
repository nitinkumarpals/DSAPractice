package practice;

public class PowOfTwoRecursion {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(pow(2,n));
	}

	public static int pow(int num, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return num;
		}
		return num*pow(num,n-1);
	}

}
