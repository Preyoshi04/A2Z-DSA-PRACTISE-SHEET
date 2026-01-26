import java.util.Scanner;

public class Kadanes_Algo_MaxSubarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum subarray sum present in the array is:" + maxSubArray(arr));
        sc.close();
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        for (int n : nums) {
            if (sum < 0) {
                sum = 0;
            }

            sum += n;

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
