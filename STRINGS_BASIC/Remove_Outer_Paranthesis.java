import java.util.*;

public class Remove_Outer_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        System.out.println("The strings are :" + outerParanthesis_Stack(str));
        sc.close();
    }

    public static String outerParanthesis(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) // inner (
                {
                    ans.append(ch);
                }
                count++;
            } else // ch == ')'
            {
                if (count > 1) // inner )
                {
                    ans.append(ch);
                }
                count--;
            }
        }
        return ans.toString();
    }

    public static String outerParanthesis_Stack(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!st.isEmpty()) {
                    ans.append(ch);
                }
                st.push(ch);
            } else // ch == )
            {
                st.pop();
                if (!st.isEmpty()) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}
