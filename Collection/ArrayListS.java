import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListS {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);

    }
}
