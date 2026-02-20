class a2buysellstock{
//121
    public static void main(String[] args) {
        int[] prices = {2,5,2,3,5,5};
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            maxProfit = Math.max(maxProfit,prices[i]-min);
        }
        System.out.println(maxProfit);
    }
}