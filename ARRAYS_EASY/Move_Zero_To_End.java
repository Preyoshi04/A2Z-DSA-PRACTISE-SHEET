import java.util.Scanner;

public class Move_Zero_To_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("The original array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("After updation , the array :");
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
     public static void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0;j<nums.length;j++)
        {
            if(nums[j] != 0)
            {
                // swap 0 with non-zero
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}
