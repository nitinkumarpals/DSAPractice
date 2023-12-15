package practice;

public class checkpalRecursion {

	public static void main(String[] args) {

		String str ="nitin";
		System.out.println(checkpal(str,0,4));
	}

	public static boolean checkpal(String str, int start, int end) {
		
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		else {
			return checkpal(str,start+1,end-1);
		}
	}

}
