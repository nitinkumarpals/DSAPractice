package practice;

public class LowerToUpperRecursion {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("nitin");
		lowerToUpper(str,4);
		System.out.println(str);
	}
	public static void lowerToUpper(StringBuilder str, int index) {
		
		if(index==-1) {
			return;
		}
		str.setCharAt(index, (char) ('A'+str.charAt(index)-'a'));
		lowerToUpper(str,index-1);
	}

}
