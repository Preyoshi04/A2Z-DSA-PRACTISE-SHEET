import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println( n + " is an Armstrong numebr ?:" + isArmstrong(n));
        sc.close();
    }
    public static boolean isArmstrong(int n)
    {
        int originalNo = n;
        int sum = 0;
        while(n != 0)
        {
            int dig = n % 10;
            sum += (dig*dig*dig);
            n = n/10;
        }
        return (sum == originalNo);
    }
}
