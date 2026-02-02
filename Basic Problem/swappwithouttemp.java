public class swappwithouttemp {
    public static void main(String[] args) {
        int a =90;
        int b= 80;
        int c= a+b;
        a=c-a;
        b=c-a;
        System.out.println(a);
        System.out.println(b);
    }
}
