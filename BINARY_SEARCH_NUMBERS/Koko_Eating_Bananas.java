import java.util.*;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the amount of bananas");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of hours:");
        int h = sc.nextInt();
        System.out.println("The amount of bananas KOKO ,ust eat per hour is " + minEatingSpeed(arr, h));
        sc.close();
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalHours = totalHour(piles, mid);

            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static long totalHour(int[] arr, int speed) {
        long total = 0;
        for (int a : arr) {
            total += (a + speed - 1) / speed; // ceiling er formula: ceil(a/b)= (a+b -1)/b
        }
        return total;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            max = Math.max(max, n);
        }
        return max;
    }
}
