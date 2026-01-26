import java.util.*;

public class Majority_Element_nBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int majorityElement = findMajorityElement(arr);
        if (majorityElement != -1) {
            System.out.println("Majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
        sc.close();
    }

    public static int findMajorityElement(int[] nums) {
        int el = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                el = nums[i];
                count++;
            } else if (nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                count1++;
            }
        }
        if (count1 > (n / 2)) {
            return el;
        }
        return -1;
    }
}
