package com.sri.Machine;

import java.util.Scanner;

public class Action {
	public static void main(String args[]) {

		int water = 400;
		int milk = 540;
		int coffeeBeans = 120;
		int cups = 9;
		int money = 550;
		int flag = 0;

		System.out.println("The coffee machine has:");
		System.out.println("400 of water");
		System.out.println("540 of milk");
		System.out.println("120 of coffee beans");
		System.out.println("9 of disposable cups");
		System.out.println("550 of money");
		System.out.println();

		while (flag == 0) {
			System.out.println("Write action(buy, fill, take, remaining, exit):");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();

			switch (str) {

			case "buy":
				System.out.println(
						"What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4-back - to main menu:");
				int num = scanner.nextInt();

				switch (num) {
				
				case 1:
					if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
						System.out.println("I have enough resources, making you a coffee!\n");
						water = -250;
						coffeeBeans = -16;
						money = money + 4;
						cups--;
						break;
					} else {
						System.out.println("sorry, not enough water!\n");
						break;
					}
					
				case 2:
					if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
						System.out.println("I have enough resources, making you a coffee!\n");
						water = -350;
						milk = -75;
						coffeeBeans = -20;
						money = money + 7;
						cups--;
						break;
					} else {
						System.out.println("sorry, not enough water!\n");
						break;
					}
					
				case 3:
					if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
						System.out.println("I have enough resources, making you a coffee!\n");
						water = -200;
						milk = -100;
						coffeeBeans = -12;
						money = money + 6;
						cups--;
						break;
					} else {
						System.out.println("sorry, not enough water!\n");
						break;
					}
				case 4:
					break;
				}
				break;
				
			case "fill":
				System.out.println("Write how many ml of water do you want to add:");
				int addWater = scanner.nextInt();
				System.out.println("Write how many ml of milk do you want to add:");
				int addMilk = scanner.nextInt();
				System.out.println("Write how many grams of coffee beans do you want to add:");
				int addCoffeeBeans = scanner.nextInt();
				System.out.println("Write how many disposable cups of coffee do you want to add:");
				int addCups = scanner.nextInt();
				break;
				
			case "take":
				System.out.println("I gave you $" + money);
				money = 0;
				break;
				
			case "remaining":
				System.out.println("The coffee machine has:\n" + water + " of water");
				System.out.println(milk + " of milk");
				System.out.println(coffeeBeans + " of coffee beans");
				System.out.println(cups + " of disposable cups");
				System.out.println(money + " of money");
				break;
			
			case "exit":
			    flag = 1;
				break;
		      
				

			}

		}

	}

}
