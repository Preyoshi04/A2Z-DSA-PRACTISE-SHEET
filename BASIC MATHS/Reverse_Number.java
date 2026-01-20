import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("The reversed number of " + n + " is :" + reverse(n));
        sc.close();
    }
    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int rem = x % 10;
            x /= 10;

            // overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && rem > 7))
                return 0;

            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && rem < -8))
                return 0;

            rev = rev * 10 + rem;
        }

        return rev;
    }
}

