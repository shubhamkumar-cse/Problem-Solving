public class NestedFinally {
    public static void main(String[] args) {
        try {
            String str = "Shubham Singh";
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error");
            } finally {
                System.out.println("Hello");
            }
        }

    }

}
