import java.util.*;

public class Alternating_Signs_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange_brute(arr);
        rearrange(arr);
        System.out.println("The rearranged array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    // BRUTE FORCE (when no of positive and negatives are not equal)
    static void rearrange_brute(int[] arr) {
    ArrayList<Integer> pos = new ArrayList<>(); // EXTRA SPACE FOR POSITIVE ELEMENTS
    ArrayList<Integer> neg = new ArrayList<>(); // EXTRA SPACE FOR NEGATIVE ELEMENTS

    for (int n : arr) { // SEPARATING POSITIVE AND NEGATIVE ELEMENTS
    if (n >= 0) {
    pos.add(n);
    } else {
    neg.add(n);
    }
    }

    int p = 0, n = 0, index = 0;
    while (p < pos.size() && n < neg.size()) {
    if (index % 2 == 0) { // EVEN INDEX - POSITIVE ELEMENT
    arr[index] = pos.get(p);
    p++;
    } else { // ODD INDEX - NEGATIVE ELEMENT
    arr[index] = neg.get(n);
    n++;
    }
    index++;
    }
    while (p < pos.size()) { // REMAINING POSITIVE ELEMENTS
    arr[index] = pos.get(p);
    p++;
    index++;
    }
    while (n < neg.size()) { // REMAINING NEGATIVE ELEMENTS
    arr[index] = neg.get(n);
    n++;
    index++;
    }
    }

    // OPTIMAL (when no of positive and negatives are equal)
    static void rearrange(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n]; // new array to store result

        int pos = 0; // index for placing pos elements
        int neg = 1; // index for placing neg elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) // positive element
            {
                ans[pos] = arr[i]; // placing at even index
                pos += 2; // -2 to next even index
            } else // negative element
            {
                ans[neg] = arr[i]; // placing at odd index
                neg += 2; // +2 to next odd index
            }
        }
        // copying back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
}
