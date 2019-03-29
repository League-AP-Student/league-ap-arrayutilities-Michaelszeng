
public class NumberMatrix {
	private int[][] matrix;
	
	/** Constructs a number matrix. */ 
	public NumberMatrix(int[][] m) 
	{ matrix = m; }
	
	/**Shifts each matrix element to the next position in row-major order 
	 * and inserts the new number at the front. The last element in the last 
	 * row is discarded.
	 * @param num the new number to insert at the front of matrix
	 * Postcondition:The original elements of matrix have been shifted to 
	 * 				 the next higher position in row-major order, and
	 * 				 matrix[0][0] == num.
	 * 				 The original last element in the last row is discarded.
	 */	
	public void shiftMatrix(int num) {
		int copy[][] = new int[matrix.length][matrix[0].length];
		for (int i=0; i<matrix.length; i++) {
			for (int c=0; c<matrix[i].length; c++) {
				copy[i][c] = matrix[i][c];
			}
		}
		
		for (int i=0; i<matrix.length; i++) {
			for (int c=1; c<matrix[i].length; c++) {
		
					if (c==matrix[i].length-1) {
						matrix[i][c] = copy[i][c-1];
						if (i<matrix.length-1) {
							matrix[i+1][0] = copy[i][c];
						}
					}
					else {
						matrix[i][c] = copy[i][c-1];
					}
			}
		}
		matrix[0][0] = num;
	}
	
	/**Rotates each matrix element to the next higher position in row-major 
	 * order.
	 * Postcondition: The original elements of matrix have been shifted
	 * 				  to the next higher position in row-major order, and 
	 * 				  matrix[0][0] == the original last element.
	 */
	public void rotateMatrix() {
		int temp = matrix[matrix.length-1][matrix[0].length-1];
		shiftMatrix(temp);
	}
	
	// There may be instance variables, constructors, and methods that are not
	// shown.
	
	public int[][] getMatrix(){
		return matrix;
	}
}
