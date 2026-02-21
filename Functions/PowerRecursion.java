public class PowerRecursion {

    static int power(int a, int b) {

        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;

        System.out.println("Power: " + power(base, exponent));
    }
}