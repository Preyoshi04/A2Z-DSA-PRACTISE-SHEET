import java.util.*;
public class GCD_HCF {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int n2 = sc.nextInt();
        System.out.println("The GCD or HCF of " + n1 + " and " + n2 + " is : "+gcd(n1,n2));
        sc.close();
    }
    public static int gcd(int n1,int n2)
    {
        // int ans = 1;  // gcd of any two nos is always 1
        // int boundary = Math.min(n1,n2);
        // for(int i = 1;i<=boundary;i++)
        // {
        //     if(n1 % i == 0 && n2 % i == 0)
        //     {
        //         ans = i;
        //     }
        // }
        // return ans;

//euclidean algo --> gcd(a,b) == gcd(a%b,b) [a > b] -->  and once, any one number becomes zero, the other nomber itself is the GCD

        while(n1 > 0 && n2 > 0)
        {
            if(n1 > n2)
            {
                n1 = n1 % n2;
            }
            else
            {
                n2 = n2 % n1;
            }
        }
       return (n1==0)? n2 : n1;
    }
}
