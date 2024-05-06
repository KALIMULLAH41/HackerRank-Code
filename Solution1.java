/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hacker1;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class Solution1 {
    
    private String pattern;

    Solution1() {
        // Regular expression to validate IP addresses
        pattern = "(\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
    }

    public String getPattern() {
        return pattern;
    }
}

 class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1 myRegex = new Solution1();

        while (scanner.hasNext()) {
            String ip = scanner.next();
            System.out.println(ip.matches(myRegex.getPattern()));
        }

        scanner.close();
    }
}

    

