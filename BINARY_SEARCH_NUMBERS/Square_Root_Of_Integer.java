// we have to return only the integer value of the square root of n, so we can use binary search to find the largest integer x such that x^2 <= n.

import java.util.Scanner;

public class Square_Root_Of_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int ans = mySqrt(n);
        System.out.println("The square root of " + n + " is: " + ans);
        sc.close();
    }

    // brute force approach O(n)
    public static int mySqrtBrute(int n) {
        if (n == 0) {
            return 0;
        }
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            if ((i * i) <= n) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }

    // optimal binary search approach O(log n)
    public static int mySqrt(int n) {
        if (n == 0)
            return 0;
        int low = 1;
        int high = n;
        int ans = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid * mid) <= n) { // if mid^2 is less than or equal to n, we can update our answer and search in
                                    // the right half
                ans = mid;
                low = mid + 1; // becox anything smaller than mid will also be smaller than n...
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
