import model.Matrix;
import view.Result;

/**
 * Created by ivand on 14.06.2017.
 */
public class TaskTwo {

    public static void main(String... args) {

        Matrix matrix = new Matrix();
        Result result = new Result();

        matrix.createMatrix();
        result.showTitle();
        result.showMatrix(matrix);
        result.showResultTitle();
        result.showResult(matrix, Matrix.getMatrixCenter());
    }
}
