import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[] twoSum (int[] input, int target) {
        for (int i = 0; i < input.length; i++ ){
            for (int j = i+1; j < input.length; j++ ) {
                if ( input[i] + input[j]  == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] inputArr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            inputArr[i] = scanner.nextInt();

        }

        System.out.print("Enter target sum: ");

        int target = scanner.nextInt();

        int[] result = twoSum(inputArr, target);
        if (result != null) {
            System.out.println("Indices found: " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers add up to " + target);
        }
        scanner.close();

    }
}