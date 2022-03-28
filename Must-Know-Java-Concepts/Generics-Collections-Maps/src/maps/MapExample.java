package maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        final Map<String, String> map = new HashMap<>();

        // Insertion into a HashMap
        map.put("Key1", "Val1");
        map.put("Key2", "Val2");
        map.put("Key3", "Val3");
        map.put("Key4", "Val4");

        // Updating in a Map
        map.replace("Key4", "NO_VAL");

        // Insertion using putIfAbsent will only insert when the key is not present
        map.putIfAbsent("Key5", "Val5");

        // Retrieval
        map.get("Key1");

        // Retrieval using getOrDefault ensures if key is not present, the default value is returned
        map.getOrDefault("Key1", "Nothing Found");

        // Checks if a Key is present or not
        map.containsKey("Key1");
    }
}
