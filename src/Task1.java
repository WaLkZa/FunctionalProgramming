import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,7,3,15,8,6,24);

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        list.stream().filter(n -> n % k == 0).collect(toReversedList()).forEach(System.out::println);
    }

    private static <T> Collector<T, ?, List<T>> toReversedList() {
        return Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list;
        });
    }
}