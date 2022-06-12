import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        int k = scanner.nextInt();

        Arrays.stream(words).filter(w -> w.length() <= k).forEach(System.out::println);
    }
}