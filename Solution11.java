/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kalim
 */
public class Solution11 {
    

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        int count = 0;

        // Find the maximum height of candles
        for (int candle : candles) {
            if (candle > max) {
                max = candle;
                count = 1;
            } else if (candle == max) {
                count++;
            }
        }

        return count;
    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = new ArrayList<>();
        String[] candlesItems = bufferedReader.readLine().split(" ");
        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesItems[i]);
            candles.add(candlesItem);
        }

        int result = Solution11.birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}

    

