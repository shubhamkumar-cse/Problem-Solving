public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = { 0,1,2, 4, 5 };
        int n = 5;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing Number = " + missing);
    }
}
