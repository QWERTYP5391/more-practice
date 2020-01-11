public class ChangePossibilities {

    public static int changePossibilities(int amount, int[] denominations) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int coin : denominations){
            for(int x =coin; x <= amount; x++ ){
                dp[x] += dp[x - coin];
            }
        }

        return dp[amount];
    }


}