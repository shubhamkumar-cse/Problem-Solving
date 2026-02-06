import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height of Diamond : ");
        int n=sc.nextInt();        
        int nsp=n/2;              //nsp=Number of Space
        int nst=1;                //nst=Number of Star
        int ml=n/2+1;             //ml=Middle Line
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            if(i<ml){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
            System.out.println();
        }                          
    }
}
