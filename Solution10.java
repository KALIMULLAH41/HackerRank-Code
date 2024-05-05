/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kalim
 */
public class Solution10 {
    

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long totalSum = 0;

        // Calculate the total sum of all elements
        for (int num : arr) {
            totalSum += num;
        }

        // Calculate the minimum and maximum sum
        for (int num : arr) {
            long sumWithoutNum = totalSum - num;
            minSum = Math.min(minSum, sumWithoutNum);
            maxSum = Math.max(maxSum, sumWithoutNum);
        }

        System.out.println(minSum + " " + maxSum);
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        Solution10.miniMaxSum(arr);

        bufferedReader.close();
    }
}

    

