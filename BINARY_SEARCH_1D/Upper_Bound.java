// upper bound is the smallest index which has the element greater than the target element in the sorted array (> target)

import java.util.Scanner;

public class Upper_Bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        int ans = upperBound(arr, target);
        System.out.println(ans);
        sc.close();
    }

    public static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length; // if we didnt get the high element, then we will return the length of the array as the index of the high element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                // mayb my ans
                // requires small index, so moving to left and eliminating right
                ans = mid;
                end = mid - 1;
            } else {
                // didnt got the high element, so moving to right
                start = mid + 1;
            }
        }
        return ans;
    }
}
