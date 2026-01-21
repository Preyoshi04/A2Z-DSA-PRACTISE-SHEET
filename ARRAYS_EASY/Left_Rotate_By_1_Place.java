import java.util.*;

public class Left_Rotate_By_1_Place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array rotating left by 1 place:");
        rotate(arr);
        System.out.println("The array after rotating:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void rotate(int[] arr) {
        int n = arr.length;
        reverse(arr, 0, 0);
        reverse(arr, 1, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr,int start,int end)
    {
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
