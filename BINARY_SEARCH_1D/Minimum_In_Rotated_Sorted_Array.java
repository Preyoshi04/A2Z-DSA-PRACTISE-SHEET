import java.util.Scanner;

public class Minimum_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findMin(arr);
        System.out.println(ans);
        sc.close();
    }

    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            return arr[start]; // as the array is not rotated, so the first element is the minimum element
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1; // as the minimum element is on the right side of mid, so we will move to right
                                 // and eliminate left
            } else {
                end = mid; // as the minimum element is on the left side of mid, so we will move to left
                           // and eliminate right
            }
        }
        return arr[start];
    }
}
