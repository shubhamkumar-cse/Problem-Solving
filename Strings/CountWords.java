public class CountWords {
    public static void main(String[] args) {
        String sentence = "Java is very easy to learn";
        
        int count = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            if ((i == 0 && sentence.charAt(i) != ' ') ||
                (sentence.charAt(i) != ' ' && sentence.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        
        System.out.println("Number of words: " + count);
    }
}
