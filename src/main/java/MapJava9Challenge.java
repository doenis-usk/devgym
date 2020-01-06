import java.util.Map;

public class MapJava9Challenge {
    public static void main(String... doYourBest) {
        Map<String, String> map = Map.of("no", "bugs", "nos", "stress");

        map.put("Do", "YourBest");

        map.forEach((k, v) -> {if (k == "no") map.remove(k);});

        System.out.println(map);
    }
}