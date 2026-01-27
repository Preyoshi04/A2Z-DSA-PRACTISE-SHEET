import java.util.*;

public class Leaders_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> leaders = findLeaders(arr);
        System.out.println("The leaders in the array are:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
        sc.close();
    }

    //BRUTE FORCE APPROACH - O(N^2) TIME & O(1) SPACE
    // FOR EVERY ELEMENT, CHECK IF THERE IS ANY GREATER ELEMENT ON RIGHT SIDE
    static List<Integer> findLeadersBrute(int[] arr) {
        List<Integer> result = new ArrayList<>(); // to store leaders
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) { // found a greater element on right side
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                result.add(arr[i]);
            }
        }

        return result;
    }
    // OPTIMAL APPROACH - O(N) TIME & O(K) SPACE
    // ANY NUMBER WHICH IS GREATER THAN THE MAXIMUM NO IN IT'S RIGHT IS A LEADER!
    // WE FIND MAX IN THE RIGHT HAND SIDE AND COMPARE IT WITH CURRENT ELEMENT
    static List<Integer> findLeaders(int[] arr) {
        List<Integer> result = new ArrayList<>(); // to store leaders
        int n = arr.length;

        int max = Integer.MIN_VALUE; 
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {  // found a leader
                max = arr[i];
                result.add(max);
            }
        }

        return result;
    }
}
