package mta.edu.vn.array;

import java.util.Scanner;

public class test {

    public static void input(int[][] a, int row, int col) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("a [" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void output(int[][] a, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //
    public static void swapRow(int[][] a, int row1, int row2, int col) {
        int temp = 0;
        if (row1 == row2) {
            return;
        }
        for (int i = 0; i < col; i++) {
            temp = a[row1][i];
            a[row1][i] = a[row2][i];
            a[row2][i] = temp;
        }
    }

    //
    public static void swapCol(int[][] a, int col1, int col2, int row) {
        int temp = 0;
        if (col1 == col2) {
            return;
        }
        for (int i = 0; i < row; i++) {
            temp = a[i][col1];
            a[i][col1] = a[i][col2];
            a[i][col2] = temp;
        }
    }

    //
    public static void mergeRow(int[][] a, int row1, int row2, int col) {
        int temp = 0;
        if (row1 == row2) {
            return;
        }
        for (int i = 0; i < col; i++) {
            a[row1][i] = a[row2][i];
        }
    }

    //
    public static void mergeCol(int[][] a, int col1, int col2, int row) {
        if (col1 == col2) {
            return;
        }
        for (int i = 0; i < row; i++) {
            a[i][col1] = a[i][col2];
        }
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] a = new int[row][col];
        input(a, row, col);
        output(a, row, col);
        swapRow(a, 1, 2, 3);
        System.out.println("after swap row");
        output(a, row, col);
        System.out.println("after swap col");
        swapCol(a, 0, 1, 3);
        output(a, row, col);
        System.out.println("after merged row1 = 1 => row2 = 2");
        mergeRow(a, 1, 2, 3);
        output(a, row, col);
        System.out.println("after merged col1 = 1 => col2 = 2");
        mergeCol(a, 1, 2, 3);
        output(a, row, col);
    }

}
