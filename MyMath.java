//This Java 8 challenge tests your knowledge of Lambda expressions!
//
//Write the following methods that return a lambda expression performing a specified action:
//
//PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
//PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
//PerformOperation isPalindrome(): The lambda expression must return true  if a number is a palindrome or false  if it is not.
//Input Format
//
//Input is handled for you by the locked stub code in your editor.
//
//Output Format
//
//The locked stub code in your editor will print T  lines of output.
//
//Sample Input
//
//The first line contains an integer,  T (the number of test cases).
//
//The  T subsequent lines each describe a test case in the form of 2  space-separated integers:
//The first integer specifies the condition to check for (  1 for Odd/Even, 2  for Prime, or  3 for Palindrome). The second integer denotes the number to be checked.
//
//5
//1 4
//2 5
//3 898
//1 3
//2 12
//Sample Output
//
//EVEN
//PRIME
//PALINDROME
//ODD
//COMPOSITE
package HackerRankCode;
import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Lambda expression to check if a number is odd
    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    // Lambda expression to check if a number is prime
    public static PerformOperation isPrime() {
        return n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    // Lambda expression to check if a number is palindrome
    public static PerformOperation isPalindrome() {
        return n -> {
            int num = n;
            int reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            return n == reversed;
        };
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            switch (ch) {
                case 1:
                    op = MyMath.isOdd();
                    ans = MyMath.checker(op, num) ? "ODD" : "EVEN";
                    break;
                case 2:
                    op = MyMath.isPrime();
                    ans = MyMath.checker(op, num) ? "PRIME" : "COMPOSITE";
                    break;
                case 3:
                    op = MyMath.isPalindrome();
                    ans = MyMath.checker(op, num) ? "PALINDROME" : "NOT PALINDROME";
                    break;
            }
            System.out.println(ans);
        }
        br.close();
    }
}


