import java.util.*;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("The number of digits in " + n + " is :" + countDigit(n));
        sc.close();
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
