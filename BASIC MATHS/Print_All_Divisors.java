import java.util.*;

public class Print_All_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("The divisors of " + n + " are : ");
        divisors(n);
        sc.close();
    }

    public static void divisors(int n) {
        // for(int i=1;i<=n;i++)
        // {
        // if(n % i == 0)
        // {
        // System.out.print(i+" ");
        // }
        // }
        for (int i = 1; (i * i) <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

                if ((n / i) != i) {
                    System.out.println(n / i);
                }
            }

        }
    }
}
