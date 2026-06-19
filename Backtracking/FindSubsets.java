public class FindSubsets {

    public static void subsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Include current character
        subsets(str, ans + str.charAt(i), i + 1);

        // Exclude current character
        subsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }
}
