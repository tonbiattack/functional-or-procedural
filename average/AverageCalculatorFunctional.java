import java.util.Arrays;
import java.util.List;

public class AverageCalculatorFunctional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);

        System.out.println("Average: " + average);
    }
}
