import java.util.*;

public class Kth_Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);

        sc.close();

    }
//brute force method
    public int findKthPositiveBrute(int[] arr, int k) {
        for (int n : arr) {
            if (n > k) // if array element is greater than "k", then all the prio nos of k are present,
                       // so we return "k"
            {
                return k;
            } else // if array el is less than "k" , so we have to find for one more missing no, so
                   // we increase "k"
            {
                k++;
            }
        }
        return k;
    }
//optimal - binary search
    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // now, my low is pointing to the index having missig nos more than "k"
        // high is pointing to index having missing nos less than "k"

        // ans --> value at low index + val of "k"

        return high + 1 + k; // low = high+1
    }
}
