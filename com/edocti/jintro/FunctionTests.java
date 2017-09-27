package com.edocti.jintro;

public class FunctionTests {

private static int asInt(String input) {
	int a=-1;
	try {
		a=Integer.parseInt(input);
	} catch(NumberFormatException e) {
		System.err.println("Not a number: "+ input);
		System.exit(-1);
	}
	return a;
}

public static void validateArgs(String[] args) {
	if (args.length !=3) {   //!= inseamna DIFERIT
		System.err.println("Usage: java FunctionTests number operator number");
		System.exit(-1);
	}
}

public static void main (String[] args) {
    validateArgs(args);
	int a=asInt(args[0]);
	String op=args[1].toLowerCase();
	int b=asInt(args[2]);
	int result=-1;
		if(op.equals("+")) {
		result=a+b;
			} else {
			System.err.println("Operation not supported: "+args[1]);
			System.exit(-1);}
	System.out.println(result);
		
}
}
