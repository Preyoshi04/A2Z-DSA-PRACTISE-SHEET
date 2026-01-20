import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println( n + " is a Prime numebr ?:" + isPrime(n));
        sc.close();
    }
    public static boolean isPrime(int n)
    {
        int count = 0;
        for(int i=1; (i*i) <= n; i++)
        {
            if(n % i==0)
            {
                count++;
                if((n/i) != i)
                {
                    count++;  //counting no of factors of the number
                }
            }
        }
        return (count == 2);  //as PRIME NUMBERS HAVE ONLY 2 FACTORS -> 1 AND ITSELF
    }
}
