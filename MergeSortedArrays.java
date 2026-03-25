import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array A: ");
        int sizeA = sc.nextInt();
        int[] A = new int[sizeA];
        System.out.println("Enter sorted elements of A:");
        for (int i = 0; i < sizeA; i++) A[i] = sc.nextInt();
        
        System.out.print("Enter size of array B: ");
        int sizeB = sc.nextInt();
        int[] B = new int[sizeB];
        System.out.println("Enter sorted elements of B:");
        for (int i = 0; i < sizeB; i++) B[i] = sc.nextInt();
        
        int[] C = new int[sizeA + sizeB];
        int i = 0, j = 0, k = 0;
        
        while (i < sizeA && j < sizeB) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < sizeA) C[k++] = A[i++];
        while (j < sizeB) C[k++] = B[j++];
        
        System.out.println("Merged array C: ");
        for (int val : C) System.out.print(val + " ");
        sc.close();
    }
}
