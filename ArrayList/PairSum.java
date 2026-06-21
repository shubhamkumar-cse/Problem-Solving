import java.util.ArrayList;

public class PairSum {
    static ArrayList<Integer> pair(ArrayList<Integer> list, int target) {
        int start = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int end = list.size() - 1;
        while (start < end) {
            if (list.get(start) + list.get(end) == target) {
                ans.add(start);
                ans.add(end);
                return ans;
            }
            if (list.get(start) + list.get(end) < target) {
                start++;
            }
            if (list.get(start) + list.get(end) > target) {
                end--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int target = 15;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(pair(list, target));
    }
}
