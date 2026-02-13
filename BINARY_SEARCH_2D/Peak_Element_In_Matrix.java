import java.util.*;

public class Peak_Element_In_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] ans = findPeakGrid(matrix);
        System.out.println("Peak element found at index: [" + ans[0] + "][" + ans[1] + "]");
        sc.close();
    }

    public static int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int low = 0;
        int high = col - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int maxRow = maxElRow(mat, mid); // Find the index of the row with the maximum element in the middle column

            // Determine left and right neighbors of middle element
            int left = mid - 1 >= 0 ? mat[maxRow][mid - 1] : Integer.MIN_VALUE;
            int right = mid + 1 < col ? mat[maxRow][mid + 1] : Integer.MIN_VALUE;

            // similar to peak el in 1d array, comparing and eliminating half of the search
            // space
            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
                return new int[] { maxRow, mid };
            } else if (mat[maxRow][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    // returns the index of the row with the maximum element in the given column
    public static int maxElRow(int[][] matrix, int col) {
        int n = matrix.length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] > max) {
                max = matrix[i][col];
                index = i;
            }
        }
        return index;
    }
}
