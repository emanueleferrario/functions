package com.edocti.jintro;


import static java.lang.System.*;

public class FormatExamples {

public static void print(String arg) {
}
public static void main (String[] args){
int a=10,b=20;
 
out.println(a);
out.println(b);
out.println(a +" ,"+b);
out.printf("%d, %d",a,b);  // %d este formatare pentru INTREG
out.printf("%7d, %07d\n",a,b);

out.printf("Hello ,%s\n",args[0]);

out.printf("The number you entered is: %7.2f\n", Float.parseFloat(args[1])); // %f este formatare pentru FLOAT
}
}

