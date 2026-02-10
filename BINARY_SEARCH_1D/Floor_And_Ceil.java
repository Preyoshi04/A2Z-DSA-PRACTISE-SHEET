// fllor of an array is the largest element which is smaller than or equal to the target element in the sorted array (<= target)
// ceil of an array is the smallest element which is greater than or equal to the target element in the sorted array (>= target)

import java.util.*;

public class Floor_And_Ceil {
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
        int floor = floor(arr, target);
        int ceil = ceil(arr, target);
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
        sc.close();
    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; 
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                // maybe my ans
                ans = arr[mid];
                // as it requires large index, so we go to right and eliminate left
                start = mid + 1;
            } else {
                // did not get the largst elemnt, so moving to left
                end = mid - 1;
            }

        }
        return ans;
    }

    public static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                // maybe my ans
                ans = arr[mid];
                // as it requires small index, so we go to left and eliminate right
                end = mid - 1;
            } else {
                // didnt got the high element, so moving to right
                start = mid + 1;
            }
        }
        return ans;
    }
}
