import java.util.List;
import java.util.stream.Collectors;

public class StringFilterFunctional {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'C': " + filteredNames);
    }
}