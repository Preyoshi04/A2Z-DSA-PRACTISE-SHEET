import java.util.Scanner;

public class How_Many_Times_Array_Is_Rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = countRotations(arr);
        System.out.println(ans);
        sc.close();
    }

    public static int countRotations(int[] arr) {
        int start = 0, end = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (start <= end) {

            // if the subarray is already sorted
            if (arr[start] <= arr[end]) {
                if (arr[start] < ans) {
                    ans = arr[start];
                    index = start;
                }
                break;
            }

            int mid = start + (end - start) / 2;

            // left half is sorted
            if (arr[start] <= arr[mid]) {
                if (arr[start] < ans) {
                    ans = arr[start];
                    index = start;
                }
                start = mid + 1;
            }
            // right half is sorted
            else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                end = mid - 1;
            }
        }
        return index;
    }

}
