package practice;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] arr = {
		            {1, 2,  3,  4},
		            {5, 6,  7,  8},
		            {9, 10, 11, 12},
		            {13,14, 15, 16}
		        };
		  int[][] arrayTwo = {
				  {17,18,19,20},
				  {10,11,12,13},
				  {14,15,16,17},
				  {19,20,21,22}
		  };
		  int[][] ans = new int[4][4];
		  int x = 7;
		  		findX(x,arr);
		  		System.out.println();
		        print2DArray(arr);
		        System.out.println();
		        print2DArrayColumnWise(arr);
		        System.out.println();
		        addTwoArray(arr,arrayTwo,ans);
		        System.out.println();
		        print2DArray(arrayTwo);
		        System.out.println();
		        print2DArray(ans);
		        System.out.println();
		        maxSumIndex(arr);
		        System.out.println();
		        diagonalSum(arrayTwo);
		       // reverseRow(arr);
		        System.out.println();
		        System.out.println("Reversed array");
		        System.out.println();
		        print2DArray(arr);
		        System.out.println();
		        printSpiral(arr);
		        System.out.println();
		        printWave(arr);
	}
	 private static void printWave(int[][] arr) {
		// TODO Auto-generated method stub
		 for(int i=0; i<arr[0].length;i++) {
			 if(i%2==0) {
				 for(int j=0; j<arr.length; j++) {
					 System.out.print(arr[j][i]+" ");
				 }
				 System.out.println();
			 }
			 else {
				 for(int j=arr.length-1; j>=0; j--) {
					 System.out.print(arr[j][i]+" ");
				 }
				 System.out.println();
			 }
		 }
		
	}
	private static void printSpiral(int[][] arr) {
		// TODO Auto-generated method stub
		 int startRow=0,startCol=0;
		 int endRow =arr.length-1;//arr.length for row
		 int endCol = arr[0].length-1;//arr[0] for num of coulmn in 0th row
		 while(startRow<=endRow && startCol <=endCol) {
			 //top
			 for(int i=startCol; i<=endCol;i++) {
				 System.out.print(arr[startRow][i]+" ");
			 }//end for top
			 System.out.println();
			 
			 
			 //right
			 for(int i=startRow+1; i<=endRow; i++ ) {
				 System.out.print(arr[i][endCol]+" ");
			 }//end right for
			 System.out.println();
			 
			 //bottom
			 for(int i=endCol-1; i>=startCol;i--) {
				 if(startRow==endRow) {
					 break;
				 }
				 System.out.print(arr[endRow][i]+" ");
			 }//end bottom for
			 System.out.println();
			 
			 
			 //left
			 for(int i=endRow-1; i>=startRow+1; i--) {
				 if(startCol==endCol) {
					 break;
				 }
				 System.out.print(arr[i][startCol]+" ");
				 
			 }//end left for
			 System.out.println();
			 startRow++;
			 endRow--;
			 startCol++;
			 endCol--;
		 }
		
	}
	private static void reverseRow(int[][] myArray) {
		 for(int i=0; i<myArray.length; i++) {
			 int start=0, end= myArray[0].length-1;
			 while(start<end) {
				 int temp = myArray[i][start];
				 myArray[i][start]=myArray[i][end];
				 myArray[i][end]=temp;
				 start++;
				 end--;
			 }
		 }
		
	}
	private static void diagonalSum(int[][] arrayTwo) {
		 	int dg1=0;
		 	int dg2=0;
		 	for(int i=0;i<arrayTwo.length;i++) {
		 		dg1 += arrayTwo[i][i];
		 	}
		 	int i=0, j=arrayTwo[0].length-1;
		 	while(j>=0) {
		 		dg2 += arrayTwo[i][j];
		 		i++;
		 		j--;
		 	}
		 	System.out.println("Diagonal 1 = "+dg1+" Diagonal 2 = "+dg2);
	}
	private static void maxSumIndex(int[][] myArray) {
		 int max=0;
		 int sum =0;
		 int index=0;
		 for(int i=0; i<myArray.length; i++) {
			 for(int j=0; j<myArray[i].length; j++) {
				 sum+= myArray[i][j];
				 if(max<sum) {
					 index=i;
					 max=sum;
				 }
			 }
			 
			sum=0;
		 }
		 System.out.println(max+" "+"["+index+"]");
		
	}
	private static void addTwoArray(int[][] myArray, int[][] arrayTwo, int[][] ans) {
		// TODO Auto-generated method stub
		 for(int i=0; i<myArray.length;i++) {
			 for(int j=0; j<myArray[i].length; j++) {
				 ans[i][j] = myArray[i][j]+arrayTwo[i][j];
			 }
		 }
		
	}
	private static int findX(int x,int[][] array) {
		 boolean foundx = false;
		 for(int i=0; i<array.length; i++) {
			 for(int j=0; j<array[i].length; j++) {
				 if(array[i][j]==x) {
					 System.out.println("Element found at "+array[i][j]);
					 foundx = true;
					 return 0;
				 }
			 }
		 }
		 if(foundx==false) {
			 System.out.println("not found");
		 }
		return 0;
		 
	}
	public static void print2DArray(int[][] array) {
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	public static void print2DArrayColumnWise(int[][] array) {
		  int maxCols = 0;
		  for (int i = 0; i < array.length; i++) {
		    maxCols = Math.max(maxCols, array[i].length);
		  }

		  for (int i = 0; i < maxCols; i++) {
		    for (int j = 0; j < array.length; j++) {
		      if (i < array[j].length) {
		        System.out.print(array[j][i] + " ");
		      } else {
		        System.out.print(" "); // To maintain alignment
		      }
		    }
		    System.out.println();
		  }
		}


}
