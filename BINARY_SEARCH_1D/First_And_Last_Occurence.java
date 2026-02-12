import java.util.*;

public class First_And_Last_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int[] ans = searchRange(arr, target);
        int[] ans2 = searchBrute(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
        sc.close();
    }

    // brute force approach
    public static int[] searchBrute(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[] { first, last };
    }

    // we can also use lower bound and upper bound approach !
    // lower bound gives the first occurence!
    // upper bound - 1 gives th last occurence index!

    // optimal binary search raw approach
    public static int[] searchRange(int[] nums, int target) {
        int first = firstIndex(nums, target);
        int last = lastIndex(nums, target);
        return new int[] { first, last };
    }

    public static int firstIndex(int[] arr, int target) {
        int first = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    public static int lastIndex(int[] arr, int target) {
        int last = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }
}
