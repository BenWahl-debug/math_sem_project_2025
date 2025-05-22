/**
 * Tests the matrix class
 * @author Jessica Swart
 * @version 2024.02.06
 */
public class MatrixTester 
{
	public static void main(String[] args) 
	{		
		int[][] nums1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Matrix m1 = new Matrix(nums1);
		System.out.println("m1: " + m1.toString());
		System.out.println("m1 Determinant: " + m1.getDeterminant3x3());	
		
		System.out.println();
		int[][] nums2 = {{1, 2}, {3, 4}, {5, 6}};
		Matrix m2 = new Matrix(nums2);
		System.out.println("m2: " + m2.toString());
		System.out.println("m2 Determinant: " + m2.getDeterminant2x2());	
		
		System.out.println();
		int[][] nums3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Matrix m3 = new Matrix(nums3);
		System.out.println("m3: " + m3.toString());
		System.out.println("m3 Determinant: " + m3.getDeterminant3x3());
		
		System.out.println();
		System.out.println("m1 equals m3: " + m1.equals(m3));
		System.out.println("m1 equals m2: " + m1.equals(m2));
		
		System.out.println("\nm1 + m3: " + MatrixMath.add(m1, m3).toString());
		System.out.println("\nm1 - m3: " + MatrixMath.subtract(m1, m3).toString());
		System.out.println("\nm1 * m3: " + MatrixMath.multiply(m1, m3).toString());
		int constant = 5;
		System.out.println("\nm1 * 5: " + MatrixMath.scalarMultiply(m1, constant).toString());
	}
}
