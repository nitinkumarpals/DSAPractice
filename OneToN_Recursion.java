package practice;

public class OneToN_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		print(n,1);
	}

	public static void print(int n, int i) {
		// TODO Auto-generated method stub
		if(i>10) {
			return;
		}
		System.out.println(n+" * "+i+" = "+n*i);
		print(n,i+1);
	}

}
