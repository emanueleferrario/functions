import java.util.*;

import java.lang.Math;

public class Exercise7 {

	public static Scanner scan = new Scanner(System.in);

	private static boolean checkPayment(double value) {
		if (value >= 0 && value <= Math.pow(10, 9)) {
			return true;
		} else {
			return false;
		}
	}

	public static void displayPayment(double value) {
		System.out.println("the payment you insered is: " + value);
	}

	public static double getSuperPayment(double value) {
		return value;
	}

	public static void main(String[] args) {
		System.out.println("Insert the payment :");
		double amount = scan.nextDouble();
		if (checkPayment(amount) == false) {
			do {
				System.out.println("The payment you insered is not valid! - Please insert another value!");
				amount = scan.nextDouble();
			} while (checkPayment(amount) == false);
		}

		displayPayment(amount);

		CURRENCY us = new CURRENCY();
		us.setSymbol("$");
		us.setCountry("US");

		CURRENCY france = new CURRENCY();
		france.setCountry("FRANCE");
		france.setSymbol("€");

		CURRENCY romania = new CURRENCY();
		romania.setSymbol("RON");
		romania.setCountry("ROMANIA");

		System.out.println("Formatted payments: ");
		System.out.println(us.getCurrencyInstance() + amount);
		System.out.println(france.getCurrencyInstance() + amount);
		System.out.println(romania.getCurrencyInstance() + amount);
	}
}

class CURRENCY extends Exercise7 {

	private String Symbol;
	private String Country;

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public double getPayment(double value) {
		return value;
	}

	public String getCurrencyInstance() {
		return getCountry() + ": " + getSymbol() + " ";
	}
}