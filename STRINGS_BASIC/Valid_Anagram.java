import java.util.*;

public class Valid_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter your second string:");
        String str2 = sc.nextLine();
        String ans = anagram_one(str1, str2) ? "anagrams" : "not anagarams";
        String ans2 = anagram_two(str1, str2) ? "anagrams" : "not anagarams";
        System.out.println("The strings are :" + ans2);
        sc.close();
    }

    public static boolean anagram_one(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static boolean anagram_two(String s1, String s2) {

        HashMap<Character, Integer> mpp = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            if (!mpp.containsKey(ch) || mpp.get(ch) == 0) {
                return false;
            }
            mpp.put(ch, mpp.get(ch) - 1);
        }
        return true;
    }
}