public class MaxPrizeCount {

    public static int countMaxPriceOccurrences(int[] prices) {
        // Check if the array is empty
        if (prices == null || prices.length == 0) {
            return 0; 
        }

        // Find the maximum price
        int maxPrice = prices[0]; 
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }

       
        int count = 0;
        for (int price : prices) {
            if (price == maxPrice) {
                count++;
            }
        }

        return count; 
    }

    public static void main(String[] args) {
     e
        int[] stockPrices = {10, 12, 8, 12, 15, 15, 15, 9, 12};
        int maxPriceCount = countMaxPriceOccurrences(stockPrices);

        System.out.println("Maximum price count: " + maxPriceCount); // Output: 3
    }
}
