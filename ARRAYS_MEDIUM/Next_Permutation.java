import java.util.*;

public class Next_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        System.out.println("The next permutation is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1; // breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) // finding longest possible prefix
            {
                index = i; // found the breakpoint index
                break;
            }
        }
        if (index == -1) { // if no breakpoint found that means array is in descending order
            reverse(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i >= index; i--) { // finding the just larger element than breakpoint
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }
        reverse(arr, index + 1, n - 1); // reversing the suffix
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
