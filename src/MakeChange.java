/**
 * Created by bbstober on 4/19/17.
 */
import java.util.HashMap;
public class MakeChange {

    public  long makeChange(int[] coins, int money){
        return makeChange(coins, money, 0, new HashMap<String, Long>());
    }

    private static long makeChange(int[] coins, int money, int index, HashMap<String, Long> memo){

        if(money == 0){
            return 1;
        }

        if(index >= coins.length){
            return 0;
        }

        int amountWithCoin = 0;
        long ways = 0;

        String  key = money + "-" + index;

        if(memo.containsKey(key)){
            return memo.get( key );
        }
        while(amountWithCoin <= money){
            int remaining = money - amountWithCoin;
            ways += makeChange(coins, remaining, index + 1, memo);
            amountWithCoin += coins[index];
        }

        memo.put(key, ways);

        return ways;
    }


}
