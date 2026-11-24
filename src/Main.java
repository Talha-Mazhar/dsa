import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer>  isAna = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            isAna.put(s.charAt(i), isAna.getOrDefault(s.charAt(i),0) + 1);
            isAna.put(t.charAt(i), isAna.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : isAna.values()){
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }
}