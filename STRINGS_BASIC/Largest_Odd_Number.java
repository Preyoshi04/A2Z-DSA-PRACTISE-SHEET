import java.util.Scanner;

public class Largest_Odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        System.out.println("The strings are :" + largestOddNumber(str));
        sc.close();
    }
//started from last digit, 
    public static String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0) {
            if (num.charAt(i) % 2 != 0) {  // if last dig is not divisible, return the whole string! [the whole string is odd]
                break;
            }
            i--;
        }
        return num.substring(0, i + 1); // or else, return the substring which have the odd dig at the end!
    }
}