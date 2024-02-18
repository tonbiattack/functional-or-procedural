package map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUpdateFunctional {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 80);
        scores.put("Charlie", 85);

        // 条件に一致するキーの値を更新した新しいMapを作成する
        Map<String, Integer> updatedScores = scores.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> "Bob".equals(entry.getKey()) ? entry.getValue() + 5 : entry.getValue()));

        System.out.println("Updated scores: " + updatedScores);
    }
}
