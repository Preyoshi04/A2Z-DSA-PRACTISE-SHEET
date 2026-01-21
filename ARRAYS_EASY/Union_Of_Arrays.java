import java.util.ArrayList;
import java.util.Scanner;

public class Union_Of_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1st array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the 1st array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the 2nd array:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the 2nd array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("After union, the new array :");
        int[] ans = unionArray(arr, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) // if the list is empty(for first time
                                                                             // inserting) OR
                { // the element is alrdy ineted, checking with the last element of the list
                    list.add(nums1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) // if the list is empty(for first time
                                                                             // inserting) OR
                { // the element is alrdy ineted, checking with the last element of the list
                    list.add(nums2[j]);
                }
                j++;
            }
        }
        // if arr1 ends but arr2 doesn't
        while (j < m) {
            if (list.get(list.size() - 1) != nums2[j]) {
                list.add(nums2[j]);
            }
            j++;
        }
        // if arr2 ends but arr1 doesnt
        while (i < n) {
            if (list.get(list.size() - 1) != nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
}
