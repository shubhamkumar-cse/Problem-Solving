import java.util.ArrayList;

public class Maximum{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(8);
        list.add(5);
        list.add(1);
        System.out.println(list);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }

            max=Math.max(max, list.get(i));
        }
        System.out.println("Maximum Element : "+ max);
    }
}