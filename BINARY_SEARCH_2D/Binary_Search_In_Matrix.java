import java.util.*;

public class Binary_Search_In_Matrix {
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
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
        sc.close();
    }

    // optimal binary seach in 2d mat.. O(log(n*m ))
    // boolean func, returns true if target found , otherwise false
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        // hypothetical indexes to perform binary serach
        int low = 0;
        int high = (row * col) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid / col][mid % col] == target) { // [mid/col] gives the row index
                                                          //  [mid%col] gives the column index
                return true;
            } else if (matrix[mid / col][mid % col] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    // brute force linear search in 2d matrix O(m*n)
    public static boolean searchMatrixBrute(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // returns index of the target element in the matrix if found, otherwise returns
    // -1
    public static int[] searchMatrixIndex(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1; // starting from top right corner

        // if target is greater, moving to down, or else moving to left
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return new int[] { i, j };
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
    }
}
