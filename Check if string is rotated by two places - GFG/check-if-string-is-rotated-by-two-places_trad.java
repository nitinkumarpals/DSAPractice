//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static void rotateclockwise(StringBuilder s){
        char c = s.charAt(s.length() - 1);
        int index = s.length() - 2;
        
        while(index>=0){
            s.setCharAt(index+1, s.charAt(index));
            index--;
        }
        s.setCharAt(0,c);
    }
    
    public static void rotateanticlockwise(StringBuilder s){
        char c = s.charAt(0);
        int index = 1;
        while(index<s.length()){
            s.setCharAt(index-1,s.charAt(index)); 
            index++;
        }
        s.setCharAt(s.length()-1,c);
    }
    public static boolean isRotated(String str1, String str2){
        // Your code here
        if(str1.length()!=str2.length()){
            return false;
        }
        //for clockwise
        StringBuilder clockwise = new StringBuilder(str1);
        //for anticlockwise
        rotateclockwise(clockwise);
        rotateclockwise(clockwise);
        
        if(clockwise.toString().equals(str2)){
            return true;
        }
        StringBuilder anticlockwise = new StringBuilder(str1);
        rotateanticlockwise(anticlockwise);
        rotateanticlockwise(anticlockwise);
        
        if(anticlockwise.toString().equals(str2)){
            return true;
        }
        return false;
    }
    
}
    
}
