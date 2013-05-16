public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (prices.length < 2)
            return 0;  // boundary case
        int mp = 0;
        int buyin = prices[0];
        for (int i=1; i<prices.length; i++) {
            int tmp = prices[i]-buyin;
            if (mp < tmp)
                mp = tmp;
            if (buyin > prices[i])
                buyin = prices[i];
        }
        return mp;
    }
}
