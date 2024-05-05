/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HackerRankCode;

//In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

import java.util.Scanner;

//
//Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.
//
//Input Format
//
//There are three lines of input:
//
//The first line contains an integer.
//The second line contains a double.
//The third line contains a String.
//Output Format
//
//There are three lines of output:
//
//On the first line, print String: followed by the unaltered String read from stdin.
//On the second line, print Double: followed by the unaltered double read from stdin.
//On the third line, print Int: followed by the unaltered integer read from stdin.
//To make the problem easier, a portion of the code is already provided in the editor.
//
//Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
//
//Sample Input
//
//42
//3.1415
//Welcome to HackerRank's Java tutorials!
//Sample Output
//
//String: Welcome to HackerRank's Java tutorials!
//Double: 3.1415
//Int: 42
//Language
//Java 7
//More
//12345678910111213141516171819202122
//
//
//Line: 21 Col: 1
//
//Test against custom input
//Java
//You have earned 10.00 points!
//You are now 7 points away from the 1st star for your java badge.
//72%18/25
//Congratulations
//You solved this challenge. Would you like to challenge your friends?Share on FacebookShare on TwitterShare on LinkedIn
//
//Test case 0
//
//Test case 1
//
//Test case 2
//
//Test case 3
//
//Test case 4
//Compiler Message
//Success
//Input (stdin)
//42
//3.1415
//Welcome to HackerRank's Java tutorials!
//Expected Output
//String: Welcome to HackerRank's Java tutorials!
//Double: 3.1415
//Int: 42
//BlogScoringEnvironmentFAQAbout Us

 
 
public class Solution1 {
    



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the newline character
        String s = scan.nextLine();
        
        // Print the output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}

    

