import java.util.Scanner;

public class Count_Occurences_In_Array {
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
        int ans = countOccurences(arr, target);
        System.out.println(ans);
        sc.close();
    }

    public static int countOccurences(int[] arr, int target) {
        int first = firstIndex(arr, target);
        if (first == -1) {
            return 0; // If the target element is not found, return 0
        }
        int last = lastIndex(arr, target);
        return last - first + 1;
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
