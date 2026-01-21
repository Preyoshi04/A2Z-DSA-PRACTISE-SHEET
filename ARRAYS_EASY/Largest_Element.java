import java.util.*;

public class Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest element of the array is:"+largestEl(arr));
        sc.close();
    }
    public static int largestEl(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int n : arr)
        {
            if(n > max)
            {
                max = n;
            }
        }
        return max;
    }
}
