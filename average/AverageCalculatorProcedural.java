
import java.util.Arrays;
import java.util.List;

public class AverageCalculatorProcedural {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        System.out.println("Average: " + average);
    }
}