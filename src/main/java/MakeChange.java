import java.math.*;
import java.util.*;

class MakeChange {

    /*
     * Complete the 'MakeChange' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING purchaseInfo as parameter.
     */
    private static TreeMap<Double, String> coinValueMap = new TreeMap<>();

    static {
        coinValueMap.put(0.01, "PENNY");
        coinValueMap.put(0.05, "NICKEL");
        coinValueMap.put(0.1, "DIME");
        coinValueMap.put(0.25, "QUARTER");
        coinValueMap.put(0.50, "HALF DOLLAR");
        coinValueMap.put(1.00, "ONE");
        coinValueMap.put(2.00, "TWO");
        coinValueMap.put(5.00, "FIVE");
        coinValueMap.put(10.00, "TEN");
        coinValueMap.put(20.00, "TWENTY");
        coinValueMap.put(50.00, "FIFTY");
        coinValueMap.put(100.00, "ONE HUNDRED");
    }

    public static String makeChange(String purchaseInfo) {
        // Write your code here
        String[] purchaseInfoArr = purchaseInfo.split(";");
        double purchasePrice = Double.parseDouble(purchaseInfoArr[0]);
        double cashGiven = Double.parseDouble(purchaseInfoArr[1]);

        if (cashGiven < purchasePrice) {
            return "ERROR";
        }

        if (cashGiven == purchasePrice) {
            return "ZERO";
        }

        StringBuilder strBuilder = new StringBuilder();
        double change = cashGiven - purchasePrice;

        while (change > 0) {
            change = new BigDecimal(change).setScale(2, RoundingMode.HALF_UP).doubleValue();
            double coinValue = coinValueMap.floorKey(change);

            change -= coinValue;
            if (change == 0) {
                strBuilder.append(coinValueMap.get(coinValue));
            } else {
                strBuilder.append(coinValueMap.get(coinValue)).append(",");
            }
        }
        return strBuilder.toString();
    }
}

