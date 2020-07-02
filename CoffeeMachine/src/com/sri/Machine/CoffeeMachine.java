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
         System.out.println("Write how many cups of coffee you will need:");
         int num = scanner.nextInt();
         System.out.println("For " + num + " of coffee you will need:");
         System.out.println(num*200 + " ml of water");
         System.out.println(num*50 + " ml of milk");
         System.out.println(num*15 + " g of coffee beans");
    
	}

}
