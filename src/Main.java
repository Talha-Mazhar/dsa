import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static boolean containsDuplicate(int[] nums) {

       Set<Integer> seen = new HashSet<>();
       for (int num : nums){
            if (!seen.add(num)) {
                return true;
            }
       }
      return false;
    }

    public static void main(String[] args) {
    }
}