import java.util.*;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(n + " is palindrome ?:" + isPalindrome(n));
        sc.close();

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int originalNo = x;
        int revNo = 0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            revNo = revNo * 10 + rem;
        }
        if (originalNo == revNo) {
            return true;
        }
        return false;
    }
}
