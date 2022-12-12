package Array_2D;

import java.util.Scanner;

public class Spiral_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type length of the spiral matrix");
		int len = sc.nextInt();
		 int a[][]= new int [len][len];
		 int no=1;
		 int minRow=0; //1
		 int minCol=0;
		 int maxRow=len-1; //2  //1
		 int maxCol=len-1; //2
		 double square = Math.pow(len, 2);
		 while(no<=square) {
			 for(int col=minCol; col<=maxCol;col++) {
				 a[minRow][col]=no;
				 no++;
			 }
			 minRow++;
	
			 for(int row=minRow; row<=maxRow;row++) {
				 a[row][maxCol]=no;
				 no++;
			 }
			 maxCol--;  
			 
			 for(int col=maxCol;col>=minCol;col--) {
				 a[maxRow][col]=no;
				 no++;
			 }
			 maxRow--;
			 
			 for(int row=maxRow;row>=minRow;row--) {
				 a[row][minCol]=no;
				 no++;
			 }
			 minCol++;
			 		 
		 }
		 for(int row=0;row<a.length;row++)
		 {
			 for(int col=0;col<a.length;col++) 
			 {
				 
				 System.out.print(a[row][col]+"  ");
				 
			 }
			 System.out.println();
		 }

	}
}
