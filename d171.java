public class d171 {
    public static void main(String[] args) {
        /*Problem: Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the i-th day.

You want to maximize your profit by choosing a single day to buy one stock and a different day in the future to sell it.

Return the maximum profit you can achieve. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: No transactions are possible (prices keep going down).

         */
        int arr[]={7,1,5,3,6,4};
        findBuyAndSell(arr);
    }
    public static void findBuyAndSell(int []arr){
        int min=arr[0];
        int profit=Integer.MIN_VALUE;
        for (int i = 1; i <arr.length ; i++) {
            int cost=arr[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,arr[i]);
        }
        System.out.println(profit);
    }
}
