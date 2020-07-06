package com.sri.Machine;

import java.util.Scanner;

public class Action {
		
		final static Scanner scanner = new Scanner(System.in);
		static final int water = 400;
		static final int milk = 540;
		static final int coffeeBeans = 120;
		static final int cups = 9;
	    static final int money = 550;

		public static void main(String args[]) {

			System.out.println("The coffee machine has:");
			System.out.println("400 of water");
			System.out.println("540 of milk");
			System.out.println("120 of coffee beans");
			System.out.println("9 of disposable cups");
			System.out.println("550 of money");
			System.out.println();

			System.out.println("Write action (buy, fill, take)");
			String action = scanner.nextLine();

			if (action.equals("buy")) {
				makeCoffee();
			}else if(action.equals("fill")) {
				fillCoffee();
			}else if(action.equals("take")) {
				takeMoney();
			}else {
				System.out.println("Oops, you selected the wrong option");
			}
					
			
		}

		public static void makeCoffee() {
			System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
			int type = scanner.nextInt();
			

			switch (type) {
			case 1:
				int requiredWater = 250;
				int requiredCoffeeBeans = 16;
				int cost = 4;
				int requiredMilk = 0;
				int requiredCups = 1;
				
				System.out.println("The coffee machine has:");
				System.out.println(water-requiredWater + " of water");
				System.out.println(milk-requiredMilk + " of milk");
				System.out.println(coffeeBeans-requiredCoffeeBeans + " of coffee beans");
				System.out.println(cups- requiredCups + " of disposable cups");
				System.out.println(cost+ money + " of money");
			break;
			case 2:
				int latteWater = 350;
				int latteCoffeeBeans = 20;
				int lattecost = 7;
				int latteMilk = 75;
				int latteCups = 1;
				
				System.out.println();
				System.out.println("The coffee machine has:");
				System.out.println(water-latteWater + " of water");
				System.out.println(milk-latteMilk + " of milk");
				System.out.println(coffeeBeans-latteCoffeeBeans + " of coffee beans");
				System.out.println(cups- latteCups + " of disposable cups");
				System.out.println(lattecost+ money + " of money");
			break;
			case 3:
				int capWater = 200;
				int capCoffeeBeans = 12;
				int capcost = 6;
				int capMilk = 100;
				int capCups = 1;
				
				System.out.println();
				System.out.println("The coffee machine has:");
				System.out.println(water-capWater + " of water");
				System.out.println(milk-capMilk + " of milk");
				System.out.println(coffeeBeans-capCoffeeBeans + " of coffee beans");
				System.out.println(cups- capCups + " of disposable cups");
				System.out.println(capcost+ money + " of money");
			break;
			}

		}

		public static void fillCoffee() {
			
			System.out.println("Write how many ml of water do you want to add:");
			int addWater = scanner.nextInt();
			System.out.println("Write how many ml of milk do you want to add:");
			int addMilk = scanner.nextInt();
			System.out.println("Write how many grams of coffee beans do you want to add:");
			int addCoffeeBeans = scanner.nextInt();
			System.out.println("Write how many disposable cups of coffee do you want to add:");
			int addCups = scanner.nextInt();
	      
	      
	        System.out.println();
			System.out.println("The coffee machine has:");
			System.out.println(water + addWater + " of water");
			System.out.println(milk + addMilk + " of milk");
			System.out.println(coffeeBeans + addCoffeeBeans + " of coffee beans");
			System.out.println(cups + addCups + " of disposable cups");
			System.out.println(money + " of money");
	      
	      
		}

		public static void takeMoney() {
	        System.out.println("I gave you $550");
	        int collectedAmount = 550;
	        
	        
	        System.out.println();
	        System.out.println("The coffee machine has:");
			System.out.println(water + " of water");
			System.out.println(milk  + " of milk");
			System.out.println(coffeeBeans  + " of coffee beans");
			System.out.println(cups  + " of disposable cups");
			System.out.println(money - collectedAmount + " of money");
	        
	        
		}
		
		

	}


