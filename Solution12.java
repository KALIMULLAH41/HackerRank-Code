/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kalim
 */
public class Solution12 {
    

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Split the time string into hours, minutes, seconds, and AM/PM
        String[] timeComponents = s.split(":");
        int hours = Integer.parseInt(timeComponents[0]);
        int minutes = Integer.parseInt(timeComponents[1]);
        int seconds = Integer.parseInt(timeComponents[2].substring(0, 2));
        String period = timeComponents[2].substring(2);

        // If the period is PM and hours are not equal to 12, add 12 to hours
        if (period.equals("PM") && hours != 12) {
            hours += 12;
        }
        // If the period is AM and hours are equal to 12, set hours to 0
        else if (period.equals("AM") && hours == 12) {
            hours = 0;
        }

        // Format the time in 24-hour format
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Solution12.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}

    

