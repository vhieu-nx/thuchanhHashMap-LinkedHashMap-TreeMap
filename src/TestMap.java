import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Smile",10);
        hashMap.put("Smile1",31);
        hashMap.put("Smile2",29);
        hashMap.put("Smile3",29);
        for (Map.Entry<String,Integer> entry: hashMap.entrySet()
             ) {
            System.out.println(entry);
        }
        System.out.println("Tree Map");
        Map<String,Integer> treemap = new TreeMap<String,Integer>(hashMap);
        for (Map.Entry<String,Integer> entry: treemap.entrySet()
        ) {
            System.out.println(entry);
        }

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));


    }
}
