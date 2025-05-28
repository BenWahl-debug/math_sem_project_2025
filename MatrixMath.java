/**
 * Performs math operations on a matrix
 * @author Jessica Swart
 * @version 2024.02.06
 */
public class MatrixMath
{
	/**
	 * Adds matrix m1 to matrix m2
	 * @param m1 The matrix to which m2 should be added
	 * @param m2 The matrix to add to m1
	 * @return The matrix which is the sum of m1 and m2
	 */
	public static Matrix add(Matrix m1, Matrix m2)
	{
		int[][] m1Array = m1.getMatrix();
		int[][] m2Array = m2.getMatrix();
		int[][] array = new int[m1Array.length][m1Array[0].length];
		
		if (m1Array.length != m2Array.length || m1Array[0].length != m2Array[0].length)
		{
			throw new IllegalArgumentException("Matrices cannot be added.");
		}
		
		for (int i = 0; i < m1Array.length; i++)
		{
			for (int j = 0; j < m1Array[0].length; j++)
			{
				array[i][j] = m1Array[i][j] + m2Array[i][j];
			}
		
		}
		
		Matrix sum = new Matrix(array);
		return sum;
	}
	
	/**
	 * Subtracts matrix m2 from matrix m1
	 * @param m1 The matrix from which to subtract
	 * @param m2 The matrix to subtract from m1
	 * @return The matrix which is the difference between the matrices
	 */
	public static Matrix subtract(Matrix m1, Matrix m2)
	{
		int[][] m1Array = m1.getMatrix();
		int[][] m2Array = m2.getMatrix();
		int[][] array = new int[m1Array.length][m1Array[0].length];
		
		if (m1Array.length != m2Array.length || m1Array[0].length != m2Array[0].length)
		{
			throw new IllegalArgumentException("Matrices cannot be subtracted.");
		}
		
		for (int i = 0; i < m1Array.length; i++)
		{
			for (int j = 0; j < m1Array[0].length; j++)
			{
				array[i][j] = m1Array[i][j] - m2Array[i][j];
			}
		
		}
		
		Matrix difference = new Matrix(array);
		return difference;
	}
	
	/**
	 * Multiplies matrix m1 by matrix m2
	 * @param m1 The matrix to multiply by m2
	 * @param m2 The matrix to multiply to m1
	 * @return The matrix which is the product of the matrices
	 */
	public static Matrix multiply(Matrix m1, Matrix m2)
	{
		int[][] m1Array = m1.getMatrix();
		int[][] m2Array = m2.getMatrix();
		int[][] array = new int[m1Array.length][m1Array[0].length];
		
		if (m1Array[0].length != m2Array.length)
		{
			throw new IllegalArgumentException("Matrices cannot be multiplied.");
		}
		
		for (int i = 0; i < m1Array.length; i++)
		{
			for (int j = 0; j < m1Array[0].length; j++)
			{
				for (int k = 0; k < m1Array[0].length; k++)
				{
					array[i][j] += m1Array[i][k] * m2Array[k][j];
				}
			}
		}
		
		Matrix product = new Matrix(array);
		return product;
	}
	
	/**
	 * Multiplies every values in matrix m1 by constant k
	 * @param m1 The matrix by which to multiply k
	 * @param k The constant to multiply every element in matrix m1 by
	 * @return The matrix which contains every element in m1 multiplied by k
	 */
	public static Matrix scalarMultiply(Matrix m1, int k)
	{
		int[][] m1Array = m1.getMatrix();
		int[][] array = new int[m1Array.length][m1Array[0].length];
		for (int i = 0; i < m1Array.length; i++)
		{
			for (int j = 0; j < m1Array[0].length; j++)
			{
				array[i][j] = m1Array[i][j] * k;
			}
		
		}
		
		Matrix afterMultiplication = new Matrix(array);
		return afterMultiplication;
	}

	public static int tropicalPlus(Integer i1, Integer i2) {
		return Math.min(i1, i2);
	}

	public static Matrix tropicalMultiply(Matrix m1, Matrix m2){
		int[][] m1Array = m1.getMatrix();
		int[][] m2Array = m2.getMatrix();
		int[][] array = new int[m1Array.length][m1Array[0].length];
		
		if (m1Array[0].length != m2Array.length)
		{
			throw new IllegalArgumentException("Matrices cannot be multiplied.");
		}
		
		for (int i = 0; i < m1Array.length; i++)
		{
			for (int j = 0; j < m1Array[0].length; j++)
			{
				for (int k = 0; k < m1Array[0].length; k++)
				{
					array[i][j] += m1Array[i][k] * m2Array[k][j];
				}
			}
		}
		
		Matrix product = new Matrix(array);
		return product;
	}
	//has someone checked if this method actually works yet?

}
