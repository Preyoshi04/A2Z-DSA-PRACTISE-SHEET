import java.util.Scanner;

public class Search_In_Rotated_Sorted_Array_With_Duplicates {
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
        int ans = search(arr, target);
        System.out.println(ans);
        sc.close();
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
