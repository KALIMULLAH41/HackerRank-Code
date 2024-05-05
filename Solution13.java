/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kalim
 */
public class Solution13 {
 

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        // If the length of the string is odd, it's not possible to split it into two equal parts
        if (s.length() % 2 != 0) {
            return -1;
        }

        // Split the string into two substrings of equal length
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);

        // Count the frequency of characters in both substrings
        int[] count = new int[26]; // Assuming lowercase English alphabets only
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }

        // Sum up the absolute differences in frequencies to find the number of characters to change
        int changes = 0;
        for (int num : count) {
            changes += Math.abs(num);
        }

        // Since we are comparing anagrams, we only need to consider one half of the changes
        return changes / 2;
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Solution13.anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

