import java.util.*;

public class Reverse_Aray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArr(arr,0,n-1);
        System.out.println("Array after reversing using recursion:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void reverseArr(int[] arr,int start,int end)
    {
        //base case
        if(start >= end)
        {
            return;
        }
            int temp = arr[start];  //swap
            arr[start] = arr[end];
            arr[end] = temp;
        reverseArr(arr, start+1, end-1);
    }
}
