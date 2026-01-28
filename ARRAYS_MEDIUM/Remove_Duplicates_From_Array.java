import java.util.*;

public class Remove_Duplicates_From_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicates(arr);
        System.out.println("The array after removing duplicates is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    // TWO POINTER APPROACH - O(N) TIME & O(1) SPACE
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // found a unique element
                i++;
                nums[i] = nums[j]; // move it to the front
            }
        }
        return i + 1; // new length of the array
    }

}
