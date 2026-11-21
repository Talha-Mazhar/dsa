import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void reverseString(char[] s) {

        for (int left = 0, right = s.length - 1; left < right; left++, right--) {


            char temp = s[left];
            s[left] = s[right];
            System.out.println(left);
            System.out.println(right);
            s[right] = temp;
        }
    }

    public static void main(String[] args) {
        reverseString(new char[]{'T', 'a', 'l', 'h', 'a'});
    }
}