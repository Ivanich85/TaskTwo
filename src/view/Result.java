package view;

import model.Matrix;

/**
 * Created by ivand on 14.06.2017.
 */
public class Result {

    public static final String TITLE = "Матрица:";
    public static final String РЕЗУЛЬТАТ = "Результат:";
    public static final String RESULT = РЕЗУЛЬТАТ;

    //Вывод заголовка
    public void showTitle() {
        System.out.println(TITLE);
        System.out.println();
    }

    //Вывод матрицы
    public void showMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getMatrixSize(); i++) {
            showMatrixLine(matrix, i);
            System.out.println();
        }
        System.out.println();
    }

    //Вывод линии матрицы
    public void showMatrixLine(Matrix matrix, int row) {
        for (int i = 0; i < matrix.getMatrixSize(); i++) {
            System.out.print(matrix.getMatrixArray()[row][i] + " ");
        }
    }

    //Вывод заголовка для результата
    public void showResultTitle() {
        System.out.println(RESULT);
        System.out.println();
    }

    //Вывод результата
    public void showResult(Matrix matrix, int cycle) {
        showMatrixCenter(matrix);
        for (int c = 1; c <= cycle; c++) {
            //Левый столбец
            for (int i = 0; i < 2 * c; i++) {
                System.out.print(matrix.getMatrixArray()
                        [Matrix.getMatrixCenter() - c + 1 + i][Matrix.getMatrixCenter() - c] + " ");
            }
            //Нижняя строка
            for (int i = 0; i < 2 * c; i++) {
                System.out.print(matrix.getMatrixArray()
                        [Matrix.getMatrixCenter() + c][Matrix.getMatrixCenter() - c + 1 + i] + " ");
            }
            //Правый столбец
            for (int i = 0; i < 2 * c; i++) {
                System.out.print(matrix.getMatrixArray()
                        [Matrix.getMatrixCenter() + c - (1 + i)][Matrix.getMatrixCenter() + c] + " ");
            }
            //Верхняя строка
            for (int i = 0; i < 2 * c; i++) {
                System.out.print(matrix.getMatrixArray()
                        [Matrix.getMatrixCenter() - c][Matrix.getMatrixCenter() + c - (1 + i)] + " ");
            }
        }
    }

    //Вывод центра матрицы
    public void showMatrixCenter(Matrix matrix) {
        System.out.print(matrix.getMatrixArray()[Matrix.getMatrixCenter()][Matrix.getMatrixCenter()] + " ");
    }
}