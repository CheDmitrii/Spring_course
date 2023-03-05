import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::sum;
        System.out.println(comparator.compare(1, 2));

        HashMap<Integer, List<String>> listHashMap = new HashMap<>();
        Integer[] arr = {1, 2, 34, 5,4545, 45};
        for(Integer i : arr){
            if (!listHashMap.containsKey(i)){
                listHashMap.put(i, new ArrayList<>());
            }
            listHashMap.get(i).add(String.valueOf(i));
        }
    }
}