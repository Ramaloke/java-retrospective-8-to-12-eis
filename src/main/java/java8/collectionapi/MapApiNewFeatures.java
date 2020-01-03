package java8.collectionapi;

import java.util.HashMap;
import java.util.Map;

public class MapApiNewFeatures {
    public static void main(String[] args) {
        replaceAll();
        compute();
        computeIfAbsent();
        computeIfPresent();
        merge();
        getOrDefault();
        putIfAbsent();
    }

    private static void replaceAll() {
        Map<String, String> map = getTestDataMap();
        map.replaceAll((key, value) ->
                value.concat(" ~replaced~"));
        System.out.println("replaceAll: " + map);
    }

    private static void compute() {
        Map<String, String> map = getTestDataMap();
        map.compute("Name", (key, value) ->
                value.concat(" Super"));
        map.compute("Surname", (key, value) ->
                value.concat(" Simple"));

        System.out.println("compute: " + map);
    }

    private static void computeIfAbsent() {
        Map<String, String> map = getTestDataMap();
        map.computeIfAbsent("Nickname", key -> "John Doe");

        System.out.println("computeIfAbsent: " + map);
    }

    private static void computeIfPresent() {
        Map<String, String> map = getTestDataMap();
        map.computeIfPresent("Surname", (key, value) -> value.concat(" Present"));
        map.computeIfPresent("Nickname", (key, value) -> "Absent");

        System.out.println("computeIfPresent: " + map);
    }

    private static void merge() {
        Map<String, String> map = getTestDataMap();

        Map<String, String> map2 = new HashMap<>();
        map2.put("Name", "Melissa");
        map2.put("Nickname", "John Doe");

        map2.forEach((key, value) ->
                map.merge(key, value, (v1, v2) -> v1.concat("|").concat(v2)));

        System.out.println("merge: " + map);
    }

    private static void getOrDefault() {
        Map<String, String> map = getTestDataMap();
        String value = map.getOrDefault("Nickname", "No value found for the key");
        System.out.println("getOrDefault: -> Value for key 'Nickname': " + value);
    }

    private static void putIfAbsent() {
        Map<String, String> map = getTestDataMap();

        //Old way
        if(map.get("OldWayKey") == null) {
            map.put("OldWayKey", "OldWayValue");
        }

        //New way
        map.putIfAbsent("Name", "~new~ John");
        map.putIfAbsent("Nickname", "~added~ John Doe");

        System.out.println("putIfAbsent: " + map);
    }

    private static Map<String, String> getTestDataMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "John");
        map.put("Surname", "Doe");

        return map;
    }
}
