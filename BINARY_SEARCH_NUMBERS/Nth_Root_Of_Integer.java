import java.util.Scanner;

public class Nth_Root_Of_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the root:");
        int m = sc.nextInt();
        int ans = nthRoot(n, m);
        System.out.println(m + "th root of " + n + " is: " + ans);
        sc.close();
    }

    // brute force approach O(n)
    public static int nthRootBrute(int n, int m) {
        if (n == 0) {
            return 0;
        }
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            if ((int) Math.pow(i, m) <= n) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static int nthRoot(int n, int m) {
        int low = 1;
        int high = n;
        // int ans = 1;
        if (n == 0) {
            return 0;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            long ans = 1;
            for (int i = 0; i < m; i++) {
                ans = ans * mid;
                if (ans > n) {
                    break;
                }
            }
            if (ans == n) {
                return mid;
            } else if (ans > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // not found
    }
}