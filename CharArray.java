package practice;
import java.util.*;
public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr= new char[10];
		System.out.print("Enter characters for the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        
        System.out.println("Char array contents:");
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
	}

}
