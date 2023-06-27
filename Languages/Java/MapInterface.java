import java.util.Map;
import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        // the hashmap, treemmap are few implementations of 
        map.put("brand", "Google");
        map.put("type", "Engineer");
        for(Object obj: map.keySet()) {
            System.out.println(obj);
        }
        for(Object obj: map.entrySet()) {
            System.out.println(obj);
        }
    }
}
