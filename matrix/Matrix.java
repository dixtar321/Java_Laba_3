package matrix;

//import exception.My_Exception;
import exception.ProductMatrixException;
import exception.SumMatrixException;

public class Matrix {

    private int row;
    private int column;
    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getrow() {
        return row;
    }

    public int getcolumn() {
        return column;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(){
        this.row = 0;
        this.column = 0;
    }

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        matrix = new int[row][column];
        if (row > column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = 0;
                }
            }
            }
        else {
            for (int j = 0; j < column; j++) {
                for (int i = 0; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

    }



    public Matrix sum(Matrix mtx){
        if ((this.row == mtx.row) && (this.column == mtx.column)) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] += mtx.matrix[i][j];
                }
            }
        }
        else{
            throw new SumMatrixException("Wrong Matrix sizes to sum");
        }
        return mtx;
    }
    public boolean equals(Matrix mtx){
        for(int i = 0; i < this.row; i++){
            for (int j = 0; j < this.row; j++){
                if(mtx.matrix[i][j] != this.matrix[i][j]){
                    return false;
                }
            }
        }
        return true;

    }

    public Matrix product(Matrix mtx){
        int size = mtx.row;
        int size1 = mtx.column;
        Matrix result = new Matrix(size, size1);
        if(row == mtx.column){
  
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                result.matrix[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    result.matrix[i][j] += mtx.matrix[i][k] * this.matrix[k][j];
                }
            }
        }
    }
        else {
            throw new ProductMatrixException("Wrong Matrix sizes to product");
        }
        return result;
    }
    

    public void setElement(int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    public int getElement(int row, int column) {
        return this.matrix[row][column];
    }

    public String toString() {
        StringBuilder StringMatrix = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                StringMatrix.append(matrix[i][j]);
                StringMatrix.append(' ');
            }
            StringMatrix.append('\n');
        }
        return StringMatrix.toString();
    }


}