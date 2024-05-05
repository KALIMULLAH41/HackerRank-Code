//There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.
//
//Example
//
//
//The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.
//
//Function Description
//
//Complete the repeatedString function in the editor below.
//
//repeatedString has the following parameter(s):
//
//s: a string to repeat
//n: the number of characters to consider
//Returns
//
//int: the frequency of a in the substring
//Input Format
//
//The first line contains a single string, .
//The second line contains an integer, .
//
//Constraints
//
//For  of the test cases, .
//Sample Input
//
//Sample Input 0
//
//aba
//10
//Sample Output 0
//
//7
//Explanation 0
//The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .
//
//Sample Input 1
//
//a
//1000000000000
//Sample Output 1
//
//1000000000000
//Explanation 1
//Because all of the first  letters of the infinite string are a, we return .
package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author kalim
 */

public class Result2 {
   



    public static long repeatedString(String s, long n) {
        // Count the number of 'a's in the given string s
        long countOfAInS = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                countOfAInS++;
            }
        }

        // Calculate the number of times s will repeat in the first n characters
        long repeatCount = n / s.length();

        // Calculate the number of 'a's in the remaining characters after repeating s
        long remainderCount = n % s.length();
        long countOfAInRemainder = 0;
        for (int i = 0; i < remainderCount; i++) {
            if (s.charAt(i) == 'a') {
                countOfAInRemainder++;
            }
        }

        // Calculate the total count of 'a's
        return (countOfAInS * repeatCount) + countOfAInRemainder;
    }
}

class Solution1{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result2.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


    
    

