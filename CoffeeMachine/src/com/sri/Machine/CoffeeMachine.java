package com.sri.Machine;

import java.util.Scanner;

public class CoffeeMachine {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int n = scanner.nextInt();
        
 
        water = water/200;
        milk = milk/ 50;
        beans = beans/ 15;

        int min = Math.min(water, milk);
        System.out.println(min);
        min = Math.min(beans, min);
        System.out.println(min);

        if (n == min) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (n < min) {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (min - n) + " more than that)");
        } else {
            System.out.println("No, I can make only " + min + " cup(s) of coffee");
        }
         
         
	}

}
