package Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         Map<Integer, Integer> map = new HashMap<Integer, Integer>(5);
        for (int i = 0; i < 5; i++) {
            map.put(i, Integer.parseInt(reader.readLine())); // fill the map with keyboard input
        }
       RemoveMap.removeItemsMap(map);
        System.out.println(map);
    }
}
