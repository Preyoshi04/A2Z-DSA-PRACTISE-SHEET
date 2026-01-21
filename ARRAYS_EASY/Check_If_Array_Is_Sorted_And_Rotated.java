// if an array is sorted and then rotated, there will be one point where the prev element is greater than the next..count->1
// if an array is sorted and not rotated,then the last elemetn wll always be greater then athe first one.. count-->1
// we will keep a count.. if cnt is 1 or 0, then only the array is sorted as well as rotated!.. or else it is not!

import java.util.*;

public class Check_If_Array_Is_Sorted_And_Rotated {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is the array sorted and rotated ?:" + isSortedRotated(arr));
        sc.close();
    }

    public static boolean isSortedRotated(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }
        return count <= 1;
    }
}
