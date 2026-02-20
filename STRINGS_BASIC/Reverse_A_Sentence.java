import java.util.*;

public class Reverse_A_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        System.out.println("The reverse string is :" + revStr(str));
        sc.close();
    }

    public static String revStr(String str) {
        StringBuilder ans = new StringBuilder();

        String[] words = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
