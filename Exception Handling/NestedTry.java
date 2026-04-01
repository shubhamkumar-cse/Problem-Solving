public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int arr[] = { 10, 2, 3, 4 };
                arr[4] = 6;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Hello");

    }

}
