// to find the index of the given element , and if not found then return the index where it would be if it were inserted in order
// similar to finding the index which is equal to the elemnt(to search it in).. or the index which is just greater than the element(to put it in) in the sorted array
// SIMILAR TO LOWER BOUND !

import java.util.Scanner;

public class Search_Insert_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        int ans = searchInsert(arr, target);
        System.out.println(ans);
        sc.close();
    }

    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length; // if we didnt get the high element, then we will return the length of the array
                              // as the index of the high element
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                // maybe my ans
                ans = mid;
                end = mid - 1;
            } else {
                // didnt got the high element, so moving to right
                start = mid + 1;
            }
        }
        return ans;
    }
}
