public class bestTimeBuy {
    static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        System.out.println(lsf);

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }


            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        System.out.println(op);
        return op;
    }
}