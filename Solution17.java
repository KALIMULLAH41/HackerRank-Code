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
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kalim
 */
public class Solution17 {
    

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Create sets to store characters from both strings
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        // Add characters from s1 to set1
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        
        // Check if any character from s2 exists in set1
        for (char c : s2.toCharArray()) {
            if (set1.contains(c)) {
                return "YES";
            }
        }
        
        // If no common character found, return "NO"
        return "NO";
    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();
            String s2 = bufferedReader.readLine();
            String result = Solution17.twoStrings(s1, s2);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

