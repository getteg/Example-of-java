package Map;

import java.util.Iterator;
import java.util.Map;

public class RemoveMap {
    public static void removeItemsMap(Map<Integer, Integer> map) {
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> pair = iterator.next();
            Integer a = pair.getValue();
            if (a >= 5 && a <= 15) {
                iterator.remove();
            }
        }
    }
}
