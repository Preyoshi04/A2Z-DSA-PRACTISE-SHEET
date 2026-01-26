import java.util.Scanner;

public class Rotate_Matrix_90_Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] mat = new int[row][cols];
        System.out.println("Enter the elemtns of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        rotate(mat);
        System.out.println("After rotating by 90 degrress the matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length; // rows
        int m = matrix[0].length; // cols

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // revrse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start <= end) {
                // reverse swapping
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
