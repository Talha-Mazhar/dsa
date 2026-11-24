import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int maxProfit(int[] prices) {
       int buy = 0;
       int profit = 0;
       for (int i = 1; i <= prices.length; i++) {
           if (prices[i] < prices[buy]){
               buy = i;
           }
           int currentProfit = prices[i] - prices[buy];
           if (currentProfit > profit) {
              profit = currentProfit;
           }
       }
       return profit;
    }

    public static void main(String[] args) {
    }
}