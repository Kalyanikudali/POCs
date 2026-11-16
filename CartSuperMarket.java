package com.pocs;

import java.util.Scanner;

public class CartSuperMarket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		String[] products = new String[100];
		double total_bill = 0;
		double[] price = new double[100];
		System.out.println("Enter number of products you want : ");
		int n = sc.nextInt();
		sc.nextLine();
		String choice;
		int i =0;
		do {
			System.out.println("Enter the product name : ");
			products[i] = sc.nextLine();

			switch (products[i].toLowerCase()) {

			case "rice" -> {
				System.out.println("the product you selected is  Rice and its price is : 92 rupees per kg");
				System.out.println("Get a discount of 10% if you select more than 5 kg...");
				System.out.println("the quantity of rice you want in kg : ");
				int rice_quant = sc.nextInt();
				sc.nextLine();
				double rice_price = 92;
				if (rice_quant >= 6) {
					rice_price = rice_price * rice_quant;

					double discount = rice_price * 0.10;
					rice_price = rice_price - discount;

					System.out.println("Price after 10% discount is: " + rice_price);
				} else {
					rice_price = rice_price * rice_quant;

					System.out.println("The price of rice is: " + rice_price);
				}
				price[i] = rice_price;
				total_bill = total_bill + price[i];
			}

			case "wheat" -> {
				System.out.println("the product you selected is  Wheat and its price is : 60 rupees per kg");
				System.out.println("Get a discount of 6% if you select more than 2 kg...");
				System.out.println("the quantity of Wheat you want in kg : ");
				int wheat_quant = sc.nextInt();
				sc.nextLine();
				double wheat_price = 60;
				if (wheat_quant >= 3) {
					wheat_price = wheat_price * wheat_quant;

					double discount = wheat_price * 0.06;
					wheat_price = wheat_price - discount;

					System.out.println("Price after 6% discount that is : " + discount
							+ " the total price of wheat is : " + wheat_price);
				} else {
					wheat_price = wheat_price * wheat_quant;

					System.out.println("The price of rice is: " + wheat_price);
				}
				price[i] = wheat_price;
				total_bill = total_bill + price[i];
			}

			case "sugar" -> {
				System.out.println("the product you selected is Sugar and its price is : 50 rupees per kg");
				System.out.println("Get a discount of 8% if you select 4 kg or more...");
				System.out.println("the quantity of sugar you want in kg : ");

				int sugar_quant = sc.nextInt();
				sc.nextLine();

				double sugar_price = 50;

				if (sugar_quant >= 4) {
					sugar_price = sugar_price * sugar_quant;
					double discount = sugar_price * 0.08;
					sugar_price = sugar_price - discount;
					System.out.println("Price after 8% discount is: " + sugar_price);
				} else {
					sugar_price = sugar_price * sugar_quant;
					System.out.println("The price of sugar is: " + sugar_price);
				}

				price[i] = sugar_price;
				total_bill = total_bill + price[i];
			}

			case "dal" -> {
				System.out.println("the product you selected is Dal and its price is : 120 rupees per kg");
				System.out.println("Get a discount of 7% if you select 5 kg or more...");
				System.out.println("the quantity of dal you want in kg : ");

				int dal_quant = sc.nextInt();
				sc.nextLine();

				double dal_price = 120;

				if (dal_quant >= 5) {
					dal_price = dal_price * dal_quant;
					double discount = dal_price * 0.07;
					dal_price = dal_price - discount;
					System.out.println("Price after 7% discount is: " + dal_price);
				} else {
					dal_price = dal_price * dal_quant;
					System.out.println("The price of dal is: " + dal_price);
				}

				price[i] = dal_price;
				total_bill = total_bill + price[i];
			}

			case "salt" -> {
				System.out.println("the product you selected is Salt and its price is : 25 rupees per kg");
				System.out.println("Get a discount of 5% if you select 6 kg or more...");
				System.out.println("the quantity of salt you want in kg : ");

				int salt_quant = sc.nextInt();
				sc.nextLine();

				double salt_price = 25;

				if (salt_quant >= 6) {
					salt_price = salt_price * salt_quant;
					double discount = salt_price * 0.05;
					salt_price = salt_price - discount;
					System.out.println("Price after 5% discount is: " + salt_price);
				} else {
					salt_price = salt_price * salt_quant;
					System.out.println("The price of salt is: " + salt_price);
				}

				price[i] = salt_price;
				total_bill = total_bill + price[i];
			}

			case "oil" -> {
				System.out.println("the product you selected is Oil and its price is : 150 rupees per litre");
				System.out.println("Get a discount of 10% if you select 3 litres or more...");
				System.out.println("the quantity of oil you want in litres : ");

				int oil_quant = sc.nextInt();
				sc.nextLine();

				double oil_price = 150;

				if (oil_quant >= 3) {
					oil_price = oil_price * oil_quant;
					double discount = oil_price * 0.10;
					oil_price = oil_price - discount;
					System.out.println("Price after 10% discount is: " + oil_price);
				} else {
					oil_price = oil_price * oil_quant;
					System.out.println("The price of oil is: " + oil_price);
				}

				price[i] = oil_price;
				total_bill = total_bill + price[i];
			}

			case "maida" -> {
				System.out.println("the product you selected is Maida and its price is : 45 rupees per kg");
				System.out.println("Get a discount of 6% if you select 5 kg or more...");
				System.out.println("the quantity of maida you want in kg : ");

				int maida_quant = sc.nextInt();
				sc.nextLine();

				double maida_price = 45;

				if (maida_quant >= 5) {
					maida_price = maida_price * maida_quant;
					double discount = maida_price * 0.06;
					maida_price = maida_price - discount;
					System.out.println("Price after 6% discount is: " + maida_price);
				} else {
					maida_price = maida_price * maida_quant;
					System.out.println("The price of maida is: " + maida_price);
				}

				price[i] = maida_price;
				total_bill = total_bill + price[i];
			}

			case "rava" -> {
				System.out.println("the product you selected is Rava and its price is : 55 rupees per kg");
				System.out.println("Get a discount of 5% if you select 4 kg or more...");
				System.out.println("the quantity of rava you want in kg : ");

				int rava_quant = sc.nextInt();
				sc.nextLine();

				double rava_price = 55;

				if (rava_quant >= 4) {
					rava_price = rava_price * rava_quant;
					double discount = rava_price * 0.05;
					rava_price = rava_price - discount;
					System.out.println("Price after 5% discount is: " + rava_price);
				} else {
					rava_price = rava_price * rava_quant;
					System.out.println("The price of rava is: " + rava_price);
				}

				price[i] = rava_price;
				total_bill = total_bill + price[i];
			}

			case "toor dal" -> {
				System.out.println("the product you selected is Toor Dal and its price is : 160 rupees per kg");
				System.out.println("Get a discount of 8% if you select 3 kg or more...");
				System.out.println("the quantity of toor dal you want in kg : ");

				int toor_quant = sc.nextInt();
				sc.nextLine();

				double toor_price = 160;

				if (toor_quant >= 3) {
					toor_price = toor_price * toor_quant;
					double discount = toor_price * 0.08;
					toor_price = toor_price - discount;
					System.out.println("Price after 8% discount is: " + toor_price);
				} else {
					toor_price = toor_price * toor_quant;
					System.out.println("The price of toor dal is: " + toor_price);
				}

				price[i] = toor_price;
				total_bill = total_bill + price[i];
			}

			case "chilli powder" -> {
				System.out.println("the product you selected is Chilli Powder and its price is : 200 rupees per kg");
				System.out.println("Get a discount of 12% if you select 2 kg or more...");
				System.out.println("the quantity of chilli powder you want in kg : ");

				int chilli_quant = sc.nextInt();
				sc.nextLine();

				double chilli_price = 200;

				if (chilli_quant >= 2) {
					chilli_price = chilli_price * chilli_quant;
					double discount = chilli_price * 0.12;
					chilli_price = chilli_price - discount;
					System.out.println("Price after 12% discount is: " + chilli_price);
				} else {
					chilli_price = chilli_price * chilli_quant;
					System.out.println("The price of chilli powder is: " + chilli_price);
				}

				price[i] = chilli_price;
				total_bill = total_bill + price[i];
			}

			case "groundnuts" -> {
				System.out.println("the product you selected is Groundnuts and its price is : 100 rupees per kg");
				System.out.println("Get a discount of 10% if you select 5 kg or more...");
				System.out.println("the quantity of groundnuts you want in kg : ");

				int groundnut_quant = sc.nextInt();
				sc.nextLine();

				double groundnut_price = 100;

				if (groundnut_quant >= 5) {
					groundnut_price = groundnut_price * groundnut_quant;
					double discount = groundnut_price * 0.10;
					groundnut_price = groundnut_price - discount;
					System.out.println("Price after 10% discount is: " + groundnut_price);
				} else {
					groundnut_price = groundnut_price * groundnut_quant;
					System.out.println("The price of groundnuts is: " + groundnut_price);
				}

				price[i] = groundnut_price;
				total_bill = total_bill + price[i];
			}

			case "jaggery" -> {
				System.out.println("the product you selected is Jaggery and its price is : 70 rupees per kg");
				System.out.println("Get a discount of 7% if you select 4 kg or more...");
				System.out.println("the quantity of jaggery you want in kg : ");

				int jaggery_quant = sc.nextInt();
				sc.nextLine();

				double jaggery_price = 70;

				if (jaggery_quant >= 4) {
					jaggery_price = jaggery_price * jaggery_quant;
					double discount = jaggery_price * 0.07;
					jaggery_price = jaggery_price - discount;
					System.out.println("Price after 7% discount is: " + jaggery_price);
				} else {
					jaggery_price = jaggery_price * jaggery_quant;
					System.out.println("The price of jaggery is: " + jaggery_price);
				}

				price[i] = jaggery_price;
				total_bill = total_bill + price[i];
			}

			default -> {
				System.out.println("Invalid product selected!");
			}

			}
			i++;
			 System.out.println("Do you want to continue shopping? (yes/no)");
			    choice = sc.nextLine();

		} while (choice.equalsIgnoreCase("yes") && i < 100);
		System.out.println("total price : " + total_bill);
	}

}
