package practice;
import java.util.Scanner;

public class PalinDrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isPalindrome(num)) {
			System.out.println("Number "+num+" is palindrome ");
		}
		else
			System.out.println("not palindrome");
		
	}
	public static boolean isPalindrome(int num) {
		int n = num;
		int rev = 0;
		int pow = 0;
		while(num>0) {
			int rem = num % 10;
			rev = rev *10 + rem;
			num /= 10;
		}
		System.out.println(rev);
		if(rev==n) {
			return true;
		}
			return false;
	}
}
