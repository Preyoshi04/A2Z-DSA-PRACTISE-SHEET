import java.util.*;

public class Print_Name_N_Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n=sc.nextInt();
        System.out.println("showing names "+n+" times:");
        printName(n);
        sc.close();
    }
    public static void printName(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("My name");
        printName(n-1);
    }
}
