import java.util.Scanner;

public class MatrixMultiply {
    int[][] matrix1;
    int[][] matrix2;
    int[][] result;
    int row1, col1, row2, col2;
    
    public void setDimensions(int r1, int c1, int r2, int c2) {
        row1 = r1;
        col1 = c1;
        row2 = r2;
        col2 = c2;
        matrix1 = new int[row1][col1];
        matrix2 = new int[row2][col2];
        result = new int[row1][col2];
    }
    
    public void inputMatrix1(Scanner scanner, int matrixNumber) {
        System.out.println("Enter elements of Matrix " + matrixNumber + ":");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
    }
    
    public void inputMatrix2(Scanner scanner, int matrixNumber) {
        System.out.println("Enter elements of Matrix " + matrixNumber + ":");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
    }
    
    public void multiply() {
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
    
    public void displayResult() {
        System.out.println("Result Matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixMultiply m = new MatrixMultiply();
        
        System.out.print("Enter rows and columns for Matrix 1: ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        
        System.out.print("Enter rows and columns for Matrix 2: ");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        
        if (c1 != r2) {
            System.out.println("Matrices cannot be multiplied!");
        } else {
            m.setDimensions(r1, c1, r2, c2);
            m.inputMatrix1(scanner, 1);
            m.inputMatrix2(scanner, 2);
            m.multiply();
            m.displayResult();
        }
        scanner.close();
    }
}
