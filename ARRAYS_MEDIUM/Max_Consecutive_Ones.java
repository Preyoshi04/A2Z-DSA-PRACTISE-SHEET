import java.util.*;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findMaxConsecutiveOnes(arr);
        System.out.println("The maximum number of consecutive 1s is: " + result);
        sc.close();
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 1) {
                count++;
                if (count > maxCount) // maxCount = Math.max(count, maxCount);
                {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
