/**
 * Represents a matrix
 * @author Jessica Swart
 * @version 2024.02.02
 */
public class Matrix 
{
	private int[][] matrix;
	
	/**
	 * Creates a matrix
	 * @param userMatrix The user's matrix
	 */
	public Matrix(int[][] userMatrix)
	{
		matrix = userMatrix;
	}
	
	/**
	 * Returns the 2x2 determinant of a matrix
	 * @return The 2x2 determinant of a matrix
	 */
	public int getDeterminant2x2()
	{
		int a = matrix[0][0];
		int b = matrix[0][1];
		int c = matrix[1][0];
		int d = matrix[1][1];
		
		return a*d - b*c;
	}
	
	/**
	 * Returns the 3x3 determinant of a matrix
	 * @return The 3x3 determinant of a matrix
	 */
	public int getDeterminant3x3()
	{
		int a = matrix[0][0];
		int b = matrix[0][1];
		int c = matrix[0][2];
		int d = matrix[1][0];
		int e = matrix[1][1];
		int f = matrix[1][2];
		int g = matrix[2][0];
		int h = matrix[2][1];
		int i = matrix[2][2];
		
		return a*e*i + b*f*g + c*d*h - c*e*g - b*d*i - a*f*h;
	}
	
	/**
	 * Returns the string representation of a matrix
	 * @return The string representation of a mtrix
	 */
	public String toString()
	{
		String matrixString = "";
		for (int i = 0; i < matrix.length; i++)
		{
			matrixString += "\n";
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (j == matrix[0].length - 1)
				{
					matrixString += matrix[i][j];
				}
				else
				{
					matrixString += matrix[i][j] + " ";
				}
			}
		}
		return matrixString;
	}
	
	/**
	 * Tests if two matrices contain the exact same elements, in the same order
	 * @param otherObject The matrix to compare to
	 * @return A boolean representing whether the two matrices are equal
	 */
	public boolean equals(Object otherObject)
	{
		if (otherObject == null)
		{
			return false;
		}
		else if (otherObject.getClass() == this.getClass())
		{
			Matrix other = (Matrix) otherObject;
			
			if (matrix[0].length != other.matrix[0].length) 
			{
				return false;
			}
			else
			{
				for (int i = 0; i < matrix.length; i++)
				{
					for (int j = 0; j < matrix[i].length; j++)
					{
						if (matrix[i][j] != other.matrix[i][j])
							return false;
					}
				}
			}
		}

		return true;
	}
	
	/**
	 * Returns the matrix as a 2D array
	 * @return The matrix as a 2D array
	 */
	public int[][] getMatrix()
	{
		return matrix;
	}
}
