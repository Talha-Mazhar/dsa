import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseHalf = 0;
        while (x > reverseHalf) {
            int lastDigit = x % 10;
            reverseHalf = (reverseHalf * 10) + lastDigit;
            x = x / 10;
        }
        return x == reverseHalf || x == reverseHalf / 10;
    }

    public static void main(String[] args) {

    }
}