package practice;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("rohit");
		rev(str,0,4);
		System.out.println(str);
	}
	public static void rev(StringBuilder str, int start, int end) {
		if(start>=end) {
			return ;
		}
		char c = str.charAt(start);
		str.setCharAt(start,str.charAt(end));
		str.setCharAt(end, c);
		rev(str,start+1,end-1);
	}

}
