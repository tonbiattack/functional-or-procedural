import java.util.ArrayList;
import java.util.List;

public class DoubleTheArrayElementsProcedural {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> doubledNumbers = new ArrayList<>();
        for (int number : numbers) {
            doubledNumbers.add(number * 2);
        }

        System.out.println(doubledNumbers);
    }
}
