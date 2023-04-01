package org.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] array = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


//        int[][][][] matrix = new int[3][3][3][3];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                for (int k = 0; k < matrix[i][j].length; k++) {
//                    for (int r = 0; r < matrix[i][j][k].length; r++) {
//                        matrix[i][j][k][r] = random.nextInt(100);
//                        System.out.print(matrix[i][j][k][r] + " ");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//
//        }


//        int[][] matrix1 = new int[4][4];
//        int[][] matrix2 = new int[4][4];
//        int[][] resultMatrix = new int[4][4];
//
//        System.out.println("Matrix 1:");
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                matrix1[i][j] = random.nextInt(100);
//                System.out.print(matrix1[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("----------------------");
//
//        System.out.println("Matrix 2:");
//        for (int i = 0; i < matrix2.length; i++) {
//            for (int j = 0; j < matrix2[i].length; j++) {
//                matrix2[i][j] = random.nextInt(100);
//                System.out.print(matrix2[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("----------------------");
//        System.out.println("Result: ");
//
//        for (int i = 0; i < resultMatrix.length; i++) {
//            for (int j = 0; j < resultMatrix[i].length; j++) {
//                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
//                System.out.print(resultMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int[][] array = new int[3][];
//
//        array[0] = new int[]{1, 2, 3, 4, 5};
//        array[1] = new int[]{6, 7};
//        array[2] = new int[]{8, 9, 10};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int[][] array = new int[4][3];
//        int summ = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = random.nextInt(10);
//                summ += array[i][j];
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Summ of elements is: " + summ);


//        int maxValue = array[0][0];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (maxValue < array[i][j]) {
//                    maxValue = array[i][j];
//                    System.out.println("Temp max value is " + maxValue);
//                }
//            }
//        }
//
//        System.out.println("Max value is: " + maxValue);


    }
}
