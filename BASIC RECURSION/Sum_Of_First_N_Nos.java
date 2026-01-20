import java.util.*;
public class Sum_Of_First_N_Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n=sc.nextInt();
        System.out.println("Sum of numbers from 1 to "+n+" is "+sum(n));
        sc.close();
    }
    public static int sum(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        int ans = n + sum(n-1);
        return ans;
    }

}
