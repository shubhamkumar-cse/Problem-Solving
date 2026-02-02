public class largestThreeNO {
    public static void main(String[] args) {
        int x = 20;
        int y = 70 ;
        int z= 7;
        if(x>=y && x>=z){
            System.out.println("Largest No="+x);
        }
        else if (y>=x && y>=z) {
            System.out.println("Largest No="+y);
        }
        else
            System.out.println("Largest No="+z);
    }
}
