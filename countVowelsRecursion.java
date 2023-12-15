package practice;

public class countVowelsRecursion {

	public static void main(String[] args) {
		
		String str = "nitin";
		System.out.println(count(str,4));
	}
	public static int count(String str, int index) {
		//base condition
		if(index==-1) {
			return 0;
		}
		//Is Vowels
		if(str.charAt(index)=='a' || str.charAt(index)=='e' || 
				str.charAt(index)=='i' || str.charAt(index)=='o' || str.charAt(index)=='u' ) {
			return 1 + count(str,index-1);
		}
		else return count(str,index-1);
	}

}
