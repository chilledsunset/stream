import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCollections {
    public static void main(String[] args) {
        int[] intList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        Arrays.sort(intList);
        List<Integer> list = new ArrayList<>();
        for (int x : intList) {
            if (x > 0 && x % 2 == 0) list.add(x);
        }
        System.out.println(list);
    }
}
