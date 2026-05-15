package Medium;

public class CoinChange_322 {

    public static void main(String[] args){
        int[] arr={1,5,6};
        int amount=11;

        System.out.println(coinChange(arr,amount));
    }


    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];

        for(int i=0;i<=amount;i++){
            dp[i]=amount+1;
        }
        dp[0]=0;

        for(int i=0;i<=amount;i++){

            for(int coin:coins){
                if(coin<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
                }
            }


        }

        if(dp[amount] > amount) {
            return -1;
        }

        return dp[amount];

    }
}
