import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spiral_Matrix {
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
        int[] ans = new int[row * cols];
        spiral(mat);
        System.out.println("The Spiral matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
public static ArrayList<Integer> spiral(int[][] matrix) {
    {
       ArrayList<Integer> result = new ArrayList<>();
        int n = matrix.length; // no of rows
        int m = matrix[0].length; // no of cols

        int top = 0, bottom = n - 1; // row-wise
        int left = 0, right = m - 1; //column-wise

        //right --> down --> left --> up

        while(top <= bottom && left <= right)
        {
            // left -> right // top constant
        for (int i = left; i <= right; i++) {
            result.add(matrix[top][i]);
        }
        top++;

        //top -> bottom //right constant
        for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][right]);
        }
        right--;

        //right -> left  //bottom constant
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }

        //bottom -> top //left constant
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }
        }

        return result;
    }
}
}
