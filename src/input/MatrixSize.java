package input;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ivand on 15.06.2017.
 */
//Класс применяется для ввода разменра матрицы
public class MatrixSize {

    public static final String MATRIX_SIZE = "Размер матрицы составляет 2n - 1 x 2n - 1. Введите число n: ";
    public static final String INPUT_MISTAKE = "Необходимо ввести число. Повторите попытку.";

    public static int inputMatrixConstant() {
        System.out.print(MATRIX_SIZE);
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int matrixCons = scanner.nextInt();
                return matrixCons;
            } catch (InputMismatchException ex) {
                System.out.println(INPUT_MISTAKE);
            }
        }
    }
}