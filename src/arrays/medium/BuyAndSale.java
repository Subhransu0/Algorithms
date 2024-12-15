package arrays.medium;

public class BuyAndSale {
    public static void main(String[] args) {
        int [] arr = {7,1,4,5,6,3,8,2};
        System.out.println(buyAndSale(arr));

    }
    public static int buyAndSale(int [] arr){
        int buy = arr[0];
        int profit = 0;
        for(int i = 1 ; i < arr.length ; i ++){
            int cost = arr[i] - buy;
            profit = Math.max(profit,cost);
            buy = Math.min(buy,arr[i]);
        }
        return profit;
    }
}
