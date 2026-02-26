public class CountCharactersWithOutSpace {
    public static void main(String[] args) {
        String str =" Shubham Singh Rathore";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                count++;
            }
        }
        System.out.print("Characters = "+count);
    }
}
