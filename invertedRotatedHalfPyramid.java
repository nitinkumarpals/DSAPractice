package practice;
import java.util.*;
public class invertedRotatedHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {//i=4 4<5
			//for space
			for(int j=1; j<=n-i; j++) {//j=0 0<1
				System.out.print(" ");//                 
			}//
			//for star
			for(int k=1; k<=i; k++) {//k=0 0<3
				System.out.print("*");//qqq
			}
			System.out.println();
		}
	}

}
