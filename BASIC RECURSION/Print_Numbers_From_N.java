import java.util.*;

public class Print_Numbers_From_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n=sc.nextInt();
        System.out.println("showing numbers from "+n+" to 1 times:");
        printNumber(n);
        sc.close();
    }
    public static void printNumber(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}
