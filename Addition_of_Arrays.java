package Array_2D;

public class Addition_of_Arrays {
	public static void main(String[] args) {
		int marks1[][] = { {23,56,76},{45,67,23},{78,56,90} };
		int marks2[][] = { {23,56,76},{45,67,23},{78,56,90} };
		int marks[][]= new int[3][3];
		
		for(int row=0; row<marks.length;row++) {
			for(int col=0; col<marks.length;col++) {
				marks[row][col] = marks1[row][col]+marks2[row][col];
				System.out.print(marks[row][col]+" ");
			}
			System.out.println();
		}
	}
}
