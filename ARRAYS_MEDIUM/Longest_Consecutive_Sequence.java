import java.util.*;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = longestConsecutive(arr);
        System.out.println("The length of the longest consecutive sequence is: " + result);
        sc.close();
    }
    // BRUTE FORCE APPROACH - O(N^3) TIME & O(1) SPACE
    // FOR EVERY ELEMENT, KEEP CHECKING IF THE NEXT ELEMENT IS PRESENT IN THE ARRAY
    static int longestConsecutiveBrute(int[] arr) {
    int longestLen = 1; // minimum length is 1
    for (int i = 0; i < arr.length; i++) {
    int curr = arr[i];
    int count = 1;
    while (isFound(arr, curr + 1)) { // check for next element
    curr = curr + 1;
    count++;
    }
    longestLen = Math.max(longestLen, count); // update longest length
    }
    return longestLen;
    }

    static boolean isFound(int[] arr, int target) { // linear search to find target
    for (int num : arr) {
    if (num == target) {
    return true;
    }
    }
    return false;
    }

    // OPTIMAL APPROACH - O(N) TIME & O(N) SPACE
    // STORE ALL ELEMENTS IN A SET FOR O(1) SEARCHING
    // in every consecutive seq , the first element will never have a smaller no
    // than it, so, we search for the before no , if it does not exist, we start
    // with our encntered no!
    static int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // add all elements to the set
        }

        int longestLen = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) { // if, before no do not exist, then it's the start of a sequence
                int curr = num;
                int count = 1;

                while (set.contains(curr + 1)) { // check for next elements in the sequence
                    curr = curr + 1;
                    count++;
                }

                longestLen = Math.max(longestLen, count); // update longest length
            }
        }

        return longestLen;
    }
}
