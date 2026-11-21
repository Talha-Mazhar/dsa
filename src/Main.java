import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public List<String> fizzBuzz(int n) {

        List<String> arr = new ArrayList<>(n);

        for (int i=0; i < n; i++){
            int next = i+1;

            int modulus3 = next % 3;
            int modulus5 = next % 5;
            if (modulus3 == 0 &&  modulus5 == 0) {
                arr.add("FizzBuzz");
            }
            else if (modulus3 == 0) {
                arr.add("Fizz");
            } else if (modulus5 == 0) {
                arr.add("Buzz");
            }
            else {
                arr.add(String.valueOf(next));
            }
        }
        return arr;
    }

    public static void main(String[] args) {



    }
}