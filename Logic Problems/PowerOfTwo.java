public class PowerOfTwo {

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 16;

        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a Power of 2");
        } else {
            System.out.println(num + " is NOT a Power of 2");
        }
    }
}
