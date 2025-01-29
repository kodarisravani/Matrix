
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        System.out.println("Matrix Addition:");
        printMatrix(addMatrices(matrix1, matrix2));
        System.out.println("Matrix Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2));
        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }
}

