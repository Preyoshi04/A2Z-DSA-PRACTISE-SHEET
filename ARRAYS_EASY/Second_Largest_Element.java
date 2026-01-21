import java.util.Scanner;

public class Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element of the array is:" + secondLargestEl(arr));
        sc.close();
    }

    public static int secondLargestEl(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                secMax = max;
                max = n;
            } else if (n < max && n > secMax) {
                secMax = n;
            }
        }
        return secMax;
    }
}
