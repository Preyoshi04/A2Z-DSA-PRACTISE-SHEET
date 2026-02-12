import java.util.*;

public class Peak_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findPeakElement(arr);
        System.out.println(ans);
        sc.close();
    }

    // brute force using linear search O(n)
    public static int peakElBrute(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (((i == 0 || arr[i] > arr[i - 1]) && (i == arr.length - 1 || arr[i] > arr[i + 1]))) {
                return i;
            }
        }
        return -1;
    }

    // optimal using binary serach O(logn)
    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((nums[mid] > nums[mid - 1]) && (nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums.length;
    }
}
