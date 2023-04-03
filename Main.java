import matrix.Matrix;
import matrix.SquareMatrix;
import matrix.Dop_Matrix;

public class Main {
    public static void main(String[] args) {
        try{
        
        // Matrix m1 = new Matrix(4,3);
        // m1.setElement(0, 0, 2);
        // System.out.println(m1);
	    // SquareMatrix m2 = new SquareMatrix(3);
        // System.out.println(m2);
        // System.out.println(m2.sum(m1));
        

        Dop_Matrix m3 = new Dop_Matrix(8); 
        System.out.println(m3);
        for(int i = 0; i < m3.getcolumn(); i++){
            for(int j = 0; j < m3.getcolumn(); j++){
                m3.setElement(i, j, (int)(5 + (Math.random() * (10 - 5))));
            }
        }
        System.out.println(m3);
        } 
        catch(RuntimeException e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
