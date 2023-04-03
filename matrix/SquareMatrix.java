package matrix;

//import exception.My_Exception;
import exception.SumMatrixException;

public class SquareMatrix extends Matrix {
    private int column;
    private int[][] matrix;

    public SquareMatrix(){}

    public SquareMatrix(int row) {
        this.column = row;
        matrix = new int[column][column];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < row; i++) {
            int j = i;
            matrix[i][j] = 1;
        }
    }

    public String toString() {
        StringBuilder StringMatrix = new StringBuilder();
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < column; j++) {
                StringMatrix.append(matrix[i][j]);
                StringMatrix.append(' ');
            }
            StringMatrix.append('\n');
        }
        return StringMatrix.toString();
    }

    @Override
    public Matrix sum(Matrix mtx) {
        if (this.column == mtx.getcolumn() && this.column == mtx.getrow()) {
            for (int i = 0; i < mtx.getrow(); i++) {
                for (int j = 0; j < mtx.getrow(); j++) {
                    mtx.setElement(i, j,this.getElement(i,j) + mtx.getElement(i,j));
                }
            }
        }
        else {
            throw new SumMatrixException("Wrong size for sum (SquareMatrix)");
        }
        return mtx;
    }

     public void setElement(int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    public int getElement(int row, int column) {
        //if ((row > this.row)||()) { //finally 
        return this.matrix[row][column];
    } 

}
