// DUTCH NATIONAL FLAG ALGORITHM TO SORT AN ARRAY OF 0s, 1s AND 2s

// 0 ZONE || 1 ZONE || 2 ZONE
// 0 to low-1      → all 0s
// low to mid-1    → all 1s
// mid to high     → unknown --> this is our whole array, we start iterating from mid
// high+1 to end   → all 2s

import java.util.*;

public class Sort_0_1_2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements (0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Oriiginal array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sort012(arr);
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    static void sort012(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
