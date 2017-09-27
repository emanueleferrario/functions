
package com.edocti.jintro;

import java.util.Scanner;

public class Exercitiul2 {

public static Scanner scan=new Scanner(System.in);


private static int dim;  // dimension of the Array
private static int n;    // number of positions of rotating
private static int m;    // direction of rotation(right or left)


//-------------------------------------
public static void main(String[] args) 
{	
	System.out.println("Insert dimension of the Array");	
    dim=scan.nextInt();
	DimensionArray();

	System.out.println("Give number of positions (n) for rotating");
	n=scan.nextInt();
	PositionRotation();
    
	System.out.println("Give the direction of rotation:right'1' or left'2'");
	m=scan.nextInt();
	DirectionRotation();
	
	System.out.println("Insert the array");      // As vreau sa pun acest bloc de cod (linii 29-33) intr-o functie separata
	int[] vector =new int[dim];
	for (int i=0;i<dim;i++) {
		vector[i]=scan.nextInt();}
	for (int i=0;i<dim;i++) {
		System.out.println(vector[i]);}          //
	//------
	
	System.out.println("VectorResult is :");   
	int[] vectorresult=new int[dim];             // As vreau sa pun acest bloc de cod (linii 37-53) intr-o functie separata
	for (int i=0;i<dim;i++) {
		
		if (m==1) {
			if (i<n) {
		        vectorresult[i]=vector[dim-n+i];}
			else {
				vectorresult[i]=vector[i-n];}
		    }
		
		if (m==2) {
			if(i<dim-n) {
			vectorresult[i]=vector[i+n];}
			else {
				vectorresult[i]=vector[i-dim+n];}
			}
	}	
	
	for (int i=0;i<dim;i++) {
         System.out.println(vectorresult[i]);     //
		}

	}

//-----
public static int DimensionArray() {      // input dimensiune array
	System.out.println(dim);
	return dim;
}
//-----

public static void PositionRotation() {   // input numarul de pozitii de rotatie
	if (n<=dim) {
	System.out.println(n);
	}
	else do { 
		System.out.println("Number of positions for rotation must be smaller or equal to "+dim+", Give another number of positions");
	    n=scan.nextInt();
	}
    while (n>dim);
}
//-----	

public static void DirectionRotation() {    // input directie de rotatie (dreapta sau stanga)
	if (m==1 || m==2) {
	System.out.println(m);
	}
			
	else do {
	System.out.println("Direction of rotation must be '1' or '2', Give another input for Direction of rotation");
	m=scan.nextInt();
	}
	while ((m!=1)&&(m!=2));
	
}
    
}


