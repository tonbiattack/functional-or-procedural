package map;

import java.util.HashMap;
import java.util.Map;

public class MapUpdateProcedural {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 80);
        scores.put("Charlie", 85);

        // キーをチェックし、条件に一致する場合は値を更新する
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if ("Bob".equals(entry.getKey())) {
                scores.put(entry.getKey(), entry.getValue() + 5); // Bobのスコアを5点増やす
            }
        }

        System.out.println("Updated scores: " + scores);
    }
}
