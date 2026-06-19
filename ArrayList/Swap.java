import java.util.ArrayList;

public class Swap {
    public static void swapping(ArrayList<Integer>list,int index1,int index2) {
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(8);
        list.add(5);
        list.add(1);
        System.out.println(list);

        int index1=2;
        int index2=4;
        swapping(list, index1, index2);
        System.out.println(list);
    }
}
