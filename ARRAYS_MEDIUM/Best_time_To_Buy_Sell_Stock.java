import java.util.Scanner;

public class Best_time_To_Buy_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum profit gained in the array is:" + maxProfit(arr));
        sc.close();
    }

    public static int maxProfit(int[] prices) {
        int costPrice = prices[0];  // buying stock on first day
        int maxProfit = Integer.MIN_VALUE;
        for (int n : prices) {
            if (costPrice > n) {
                costPrice = n;  // if i can buy stock at cheaper price , then change the CP
            }
            int profit = n - costPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
