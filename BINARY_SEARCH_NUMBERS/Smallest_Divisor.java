import java.util.*;

public class Smallest_Divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        int result = smallestDivisor(nums, threshold);

        System.out.println("Smallest divisor is: " + result);

        sc.close();
    }
    // Binary Search to find smallest valid divisor

    public static int smallestDivisor(int[] nums, int threshold) {

        // divisor can never be less than 1
        int low = 1;
        int high = getMax(nums);

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = calculateSum(nums, mid);

            if (sum <= threshold) {
                ans = mid; // maybe my ans
                high = mid - 1; // try to find smaller divisor
            } else {
                low = mid + 1; // need larger divisor
            }
        }
        return ans;
    }

    public static int calculateSum(int[] nums, int divisor) {
        int total = 0;

        for (int num : nums) {
            // integer way to compute ceil(num / divisor)
            total += (num + divisor - 1) / divisor; // {a+b-1/b}
        }
        return total;
    }

    public static int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}