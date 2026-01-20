import java.util.*;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input string :");
        String str = sc.nextLine();
        System.out.println("Is palindrome string ?:" + isPalindrome(str,0,str.length()-1));
        sc.close();
    }

    public static boolean isPalindrome(String s,int start,int end) {
        if(start >= end)
        {
            return true;  // if all checks done, and start , end crosses each other, then string is palindorme
        }
        if(s.charAt(start) != s.charAt(end))  // if first nd last chars are not same, then not palindrome
        {
            return false;
        }
        return isPalindrome(s, start+1, end-1);
    }
}
