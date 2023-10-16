package practice;

import java.util.Scanner;

public class sqaure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int totRows = sc.nextInt();
		System.out.println("Enter no. of column");
		int totCols = sc.nextInt();
		for(int i=0; i<totRows; i++) {
			for(int j=0; j<totCols; j++) {
				if(i==0 || i==totRows-1 || j==0 || j==totCols-1) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();

		}
		
	}

}
