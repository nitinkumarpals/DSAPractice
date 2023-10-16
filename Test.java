package practice;

import java.util.*;

public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	      int row = sc.nextInt();
	      int col = sc.nextInt();
	      int array[][] = new int[row][col];
	      


	     // input
	      for(int i=0; i<row; i++) {
	    	  for(int j =0; j<col; j++) {
		          array[i][j] = sc.nextInt();

	    	  }
	    	  
	      }
	      for(int i = 0; i<row; i++) {
	    	  for(int j =0; j<col; j++) {
	    		  System.out.print(array[i][j] + "");
	    	  }
	    	  System.out.println("");
	    	 
	      }
//		
//	      boolean isTrue = true;
//	      for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
//	           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
//	               isTrue = false;
//	           }
//	       }
//
//
//	       if(isTrue) {
//	           System.out.println("The array is sorted in ascending order");
//	       } else {
//	           System.out.println("The array is not sorted in ascending order");
//	       }

//
//	      int max = Integer.MIN_VALUE;
//	      int min = Integer.MAX_VALUE;
//	     
//	       for(int i=0; i<numbers.length; i++) {
//	           if(numbers[i] < min) {
//	               min = numbers[i];
//	           }
//	           if(numbers[i] > max) {
//	               max = numbers[i];
//	           }

//		Scanner sc = new Scanner(System.in);
//		
//		int marks[] = new int[5];
//		for(int i =0; i<5; i++) {
//			marks[i]= sc.nextInt();
//		}
//		int x = sc.nextInt();
//		for(int i =0; i<5; i++) {
//			if(marks[i]==x) {
//				System.out.println("number found at"+ i);
//			}
//			System.out.print(marks[i]);
//			System.out.println("");
//		}
//	
//		System.out.println("hello world");
//		float number = 8.972892f;
//		System.out.println(number);
//		int num1 = 23897984;
//		int num2 = 434;
//		double sum = (double)num1+(double)num2;
//	    String name = sc.nextLine();
//	    System.out.println(name);
//	    System.out.println("enter your age");
//	    int age = sc.nextInt();
//	    if (age > 18) {
//	    	System.out.println("you are in");
//	    }
//	    else {
//	    	System.out.println("no");
//	    	
//	    } 
//	    char grade = sc.next().charAt(1);
//	    switch(grade) {
//	    case 'A':
//	    case 'a' :
//	    	System.out.println(" very good");
//	    	break;
//	    case 'B' :
//	    	System.out.println("good");
//	    	break;
//	    case 'C' :
//	    	System.out.println("ok");
//	    	break;
//	    case 'D' :
//	    	System.out.println("stay hard");
//	    	break;
//	    default :
//	    	System.out.println("invalid");
//	    	
//	    }
	
//	}
//	       System.out.println("Largest number is : " + max);
//	       System.out.println("Smallest number is : " + min);
	}
}
	
