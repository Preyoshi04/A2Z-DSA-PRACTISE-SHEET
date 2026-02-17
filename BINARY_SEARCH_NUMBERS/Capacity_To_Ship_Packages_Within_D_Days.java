import java.util.*;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int result = shipWithinDays(weights, days);

        System.out.println("Minimum ship capacity required: " + result);

        sc.close();
    }

    // --BRUTE FORCE--//

    public int shipWithinDaysBrute(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);

        for (int i = low; i <= high; i++) {
            int daysReqd = daysReq(weights, i); // passing array of weights and capacity of ship
            if (daysReqd <= days) {
                return i; // returning min ship capacity
            }
        }
        return -1;
    }

    // --OPTIMAL BINARY SEARCH--//
    public static int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);
        int ans = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int daysReqd = daysReq(weights, mid);
            if (daysReqd <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int daysReq(int[] arr, int capacity) {
        int day = 1;
        int load = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((load + arr[i]) > capacity) {
                day++;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return day;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}
