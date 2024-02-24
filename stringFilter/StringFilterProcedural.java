import java.util.ArrayList;
import java.util.List;

public class StringFilterProcedural {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("C")) {
                filteredNames.add(name);
            }
        }
        System.out.println("Names starting with 'C': " + filteredNames);
    }
}