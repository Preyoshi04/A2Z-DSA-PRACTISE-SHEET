import java.util.Scanner;

public class Set_Matrix_Zeroes {
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
        setZero(mat);
        System.out.println("The updated matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // BRITE FORCE
    static void setZero(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] newMat = new int[n][m]; // TAKING EXTRA SPACE FOR NEW MATRIX

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMat[i][j] = mat[i][j]; // COPYING ELEMENTS TO NEW MATRIX
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        newMat[k][j] = 0; // SETTING THE COL TO 0
                    }
                    for (int k = 0; k < m; k++) {
                        newMat[i][k] = 0; // SETTING THE ROW TO 0
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = newMat[i][j]; // COPYING BACK TO ORIGINAL MATRIX
            }
        }
    }
}
