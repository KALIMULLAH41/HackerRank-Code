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

    

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        // Write your code here
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        } else {
            return null;
        }
    }
}

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();
        String order = scanner.nextLine();
        Food food = foodFactory.getFood(order);
        scanner.close();
        if (food != null) {
            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        } else {
            System.out.println("Invalid input");
        }
    }
}

    

