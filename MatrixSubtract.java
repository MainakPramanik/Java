import java.util.Scanner;

public class MatrixSubtract {
    int[][] matrix1;
    int[][] matrix2;
    int[][] result;
    int rows, cols;
    
    public void setDimensions(int r, int c) {
        rows = r;
        cols = c;
        matrix1 = new int[rows][cols];
        matrix2 = new int[rows][cols];
        result = new int[rows][cols];
    }
    
    public void inputMatrix1(Scanner scanner, int matrixNumber) {
        System.out.println("Enter elements of Matrix " + matrixNumber + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
    }
    
    public void inputMatrix2(Scanner scanner, int matrixNumber) {
        System.out.println("Enter elements of Matrix " + matrixNumber + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
    }
    
    public void subtract() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
    }
    
    public void displayResult() {
        System.out.println("Result Matrix (Matrix1 - Matrix2):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixSubtract m = new MatrixSubtract();
        
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        m.setDimensions(rows, cols);
        m.inputMatrix1(scanner, 1);
        m.inputMatrix2(scanner, 2);
        m.subtract();
        m.displayResult();
        scanner.close();
    }
}
