/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hacker1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author kalim
 */
public class Solution2 {
   
    
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

            // Write your code here
            o = new Inner().new Private();
            System.out.println(num + " is " + ((Inner.Private)o).powerof2(num));
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }

    static class DoNotTerminate { // This class prevents exit(0)

        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1L;
        }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(java.security.Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }
}

    

