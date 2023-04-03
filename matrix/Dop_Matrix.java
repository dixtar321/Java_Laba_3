package matrix;
import exception.My_Exception;

public final class Dop_Matrix extends SquareMatrix{
    private int column;
    private int[][] matrix;

public Dop_Matrix(int row) {
    if(row % 4 == 0){
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
    else 
        throw new My_Exception("size for DOP_Matrix is wrong");
    }

    public void my_mirror_make(Dop_Matrix a){
        for(int i = 0; i < column / 2; i++){
            for(int j = 0; j < column / 2; j++){
                //matrix[i][j] = matrix[column - i - 1][column - j - 1];
                //matrix[column - i -1][j] = matrix[i][column - j - 1];
                matrix[i][j] = matrix[column + i - column / 2][column + j - column / 2];
                matrix[column + i - column / 2][j] = matrix[i][column + j - column / 2];
            }
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

    public int getcolumn() {
        return column;
    }

@Override
    public void setElement(int row, int column, int value) {
         this.matrix[row][column] = value;
         my_mirror_make(this);
     }
}