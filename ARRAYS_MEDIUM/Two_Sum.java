import java.util.*;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        System.out.println("The elements which adds upto " + target + " are present at indices :");
        int[] ans = twoSum(arr, target);
        if(ans[0] == -1)
        {
            System.out.println("No such pair found!");
        }
        else
        {
            System.out.println("Pair found at "+ans[0]+" and "+ans[1]);
        }
        sc.close();
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int reqd = target - arr[i];
            if (mpp.containsKey(reqd)) {
                return new int[] { mpp.get(reqd), i };
            }
            mpp.put(arr[i], i);
        }

        return new int[] { -1, -1 };
    }
}
