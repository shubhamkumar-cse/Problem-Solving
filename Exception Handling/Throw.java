public class Throw {
    public static void Wait() throws InterruptedException{
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) {
        try{
            Wait();
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
