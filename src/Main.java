import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public List<String> fizzBuzz(int n) {

        List<String> arr = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");

            arr.add(sb.isEmpty() ? String.valueOf(i) : sb.toString());
        }
        return arr;
    }

    public static void main(String[] args) {



    }
}