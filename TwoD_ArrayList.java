package practice;
import java.util.*;
public class TwoD_ArrayList {

	public static void main(String[] args) {
		 List<List<Integer>> arrayList2D = new ArrayList<>();


	        // Initialize the 4x4 ArrayList with values
	        for (int i = 0; i < 4; i++) {
	            List<Integer> row = new ArrayList<>();
	            for (int j = 0; j < 4; j++) {
	                // Add your desired values here
	                row.add(i * 4 + j + 1);
	            }
	            arrayList2D.add(row);
	        }

	        // Print the 4x4 ArrayList
	        for (List<Integer> row : arrayList2D) {
	            for (Integer value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }

	}

}
