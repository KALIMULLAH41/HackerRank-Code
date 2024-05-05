//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
//
//Given a string A, print Yes if it is a palindrome, print No otherwise.
//
//Constraints
//
// A will consist at most 50 lower case english letters.
//Sample Input
//
//madam
//Sample Output
//
//Yes
package HackerRankCode;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class Solution14 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

    

