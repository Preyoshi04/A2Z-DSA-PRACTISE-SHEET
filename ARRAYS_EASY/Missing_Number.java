import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the sizeof the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The missing element of the array is:"+missingNumber(arr));
        sc.close();
    }
    public static int missingNumber(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
