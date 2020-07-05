package com.sri.Machine;

import java.util.Scanner;

public class CoffeeMachine {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Hello World!");
//        System.out.println("Starting to make a Coffee");
//        System.out.println("Grinding Coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
//        System.out.println("Write how many cups of coffee you will need:");
//        int num = scanner.nextInt();
//        System.out.println("For " + num + " of coffee you will need:");
//        System.out.println(num*200 + " ml of water");
//        System.out.println(num*50 + " ml of milk");
//        System.out.println(num*15 + " g of coffee beans");
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
         int milk = scanner.nextInt();
         System.out.println("Write how many grams of coffee beans the coffee machine has:");
         int beans = scanner.nextInt();
         System.out.println("Write how many cups of coffee you will need");
         int cups = scanner.nextInt();
         
         int waterCups = water / 200;
         int milkCups = milk / 50;
         int beansCups = beans / 15;

         int limit = Math.min(waterCups, Math.min(milkCups, beansCups));

         if (cups > limit) {
             System.out.println("No, I can make only " + limit + " cup(s) of coffee");
         } else if (cups == limit) {
             System.out.println("Yes, I can make that amount of coffee");
         } else {
             int extra = limit - cups;
             System.out.println("Yes, I can make that amount of coffee (and even " + extra + " more than that)");
         }
         
         
         
	}

}
