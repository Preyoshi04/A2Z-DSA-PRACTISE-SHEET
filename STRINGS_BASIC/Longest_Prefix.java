import java.util.Scanner;

public class Longest_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine(); // 🔥 consume leftover newline

        System.out.println("Enter elements of your string array:");
        String[] strArr = new String[n];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.nextLine();
        }

        System.out.println("The longest common prefix is: " + prefix(strArr));
        sc.close();
    }

    public static String prefix(String[] strArr) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strArr[0].length(); i++) {
            char ch = strArr[0].charAt(i);

            for (int j = 1; j < strArr.length; j++) {
                if (i >= strArr[j].length() || strArr[j].charAt(i) != ch) {
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}
