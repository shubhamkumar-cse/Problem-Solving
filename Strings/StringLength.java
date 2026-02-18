public class StringLength {
    public static void main(String[] args) {
        String str = "Hello";
        
        int count = 0;
        
        try {
            while (true) {
                str.charAt(count);  // Access character
                count++;            // Increase counter
            }
        } catch (Exception e) {
            // When index goes out of range, loop stops
        }
        
        System.out.println("Length of string = " + count);
    }
}

