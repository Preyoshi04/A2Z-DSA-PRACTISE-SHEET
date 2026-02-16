
import java.util.*;

public class M_Bouquets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of bloomDay array:");
        int n = sc.nextInt();

        int[] bloomDay = new int[n];
        System.out.println("Enter bloom days:");
        for (int i = 0; i < n; i++) {
            bloomDay[i] = sc.nextInt();
        }

        System.out.println("Enter number of bouquets (m):");
        int m = sc.nextInt();

        System.out.println("Enter flowers per bouquet (k):");
        int k = sc.nextInt();

        int result = minDays(bloomDay, m, k);

        System.out.println("Minimum days required: " + result);

        sc.close();
    }

    public static int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = min(bloomDay);
        int high = max(bloomDay);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, k, m)) {
                high = mid - 1; // ✅ FIX
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean possible(int[] arr, int day, int flower, int bouquet) {
        int countFlower = 0;
        int bouquetPossible = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                countFlower++;
            } else {
                bouquetPossible += countFlower / flower;
                countFlower = 0;
            }
        }
        bouquetPossible += countFlower / flower;

        return bouquetPossible >= bouquet;
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr)
            min = Math.min(min, n);
        return min;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr)
            max = Math.max(max, n);
        return max;
    }
}
