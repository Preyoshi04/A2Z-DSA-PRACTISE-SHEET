import java.util.*;

public class Single_Element_In_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
        sc.close();
    }

    // brute force approach
    public static int singleNonDuplicatebrute(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            } else if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1]) {
                    return arr[i];
                }
            } else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // optimal approach
    public static int singleNonDuplicate(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        int start = 1;
        int end = arr.length - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if mid is not equal to its previous and next element then it is the single
            // element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            // if mid is even and mid is equal to its next element or mid is odd and mid is
            // equal to its previous element then the single element is in the right half
            // else it is in the left half
            else if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || mid % 2 == 1 && arr[mid] == arr[mid - 1]) {
                start = mid + 1;
            }
            // else the single element is in the left half
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
