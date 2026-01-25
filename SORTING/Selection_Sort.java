// PICK THE MINIMUM ELEMENT AND SWAP IT WITH THE FIRST ELEMENT, REPEAT FOR THE REMAINING ARRAY


import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndx]) {
                    minIndx = j;
                }
            }
            // swap
            int temp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = temp;
        }
    }
}
