import java.util.*;

public class Single_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The single element of the array is:"+singleNumber(arr));
        sc.close();
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int n : nums)
        {
            mpp.put(n,mpp.getOrDefault(n,0)+1);
        }
        for(int k : mpp.keySet())
        {
            if(mpp.get(k) == 1)
            {
                return k;
            }
        }
        return -1;
    }
}