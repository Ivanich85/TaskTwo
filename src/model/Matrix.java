package model;

import input.MatrixSize;

/**
 * Created by ivand on 14.06.2017.
 */
public class Matrix {

    public static final int RANDOM_RANGE = 1000; //Диапазон случайных значений
    private static int matrixConstant = MatrixSize.inputMatrixConstant(); //Применяяется для расчета длтны и координат центра матрицы
    private static final int MATRIX_CENTER = matrixConstant - 1; //Координаты центра матрицы
    private int matrixSize = matrixConstant * 2 - 1; //Размер стороны матрицы

    //Определяем центр матрицы
    public static int getMatrixCenter() {
        return MATRIX_CENTER;
    }

    //Опрееделяем размер матрицы
    public int getMatrixSize() {
        return matrixSize;
    }

    //Создаем пустую матрицу
    int[][] matrixArray = new int[matrixSize][matrixSize];

    //Заполняем матрицу строками
    public void createMatrix() {
        for (int i = 0; i < matrixSize; i++) {
            createMatrixRow(i);
        }
    }

    //Расчет длины строки в матрице
    private void createMatrixRow(int row) {
        RandomNumber randomNumber = new RandomNumber();
        for (int i = 0; i < matrixSize; i++) {
            matrixArray[row] [i] = randomNumber.nextInt(RANDOM_RANGE);
        }
    }

    //Вовращаем заполненную матрицу
    public int[][] getMatrixArray() {
        return matrixArray;
    }
}
