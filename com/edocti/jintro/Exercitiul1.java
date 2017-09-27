
package com.edocti.jintro;

import java.util.Scanner;

public class Exercitiul1 {

public static Scanner scan=new Scanner(System.in);

private static int dim;  // Dimension of Array 
private static int p;    // Dimension of Array Result

//-----
public static void main(String[] args) 
{	
System.out.println("Insert dimension the 2 Arrays ");	
DimensionArray();

System.out.println("Insert the First Array");	
int [] vector1=new int[dim];
vector1[0]=scan.nextInt();
System.out.println(vector1[0]);
for (int i=1;i<dim;i++) {
	vector1[i]=scan.nextInt();
	if (vector1[i]>=vector1[i-1]) {
		vector1[i]=vector1[i];
		System.out.print(vector1[i]+" ");}
	else do { 
		System.out.println("\nThe number you enter must be bigger than the last one");
		vector1[i]=scan.nextInt();
		System.out.print(vector1[i]+" ");}
	while ( vector1[i]<vector1[i-1]) ;
	}
for (int i=0;i<dim;i++) {
	System.out.println(vector1[i]);}       
//---

System.out.println("Insert the Second Array");
int[] vector2 =new int[dim];
vector2[0]=scan.nextInt();
System.out.println(vector2[0]);
for (int i=1;i<dim;i++) {
	vector2[i]=scan.nextInt();
	if (vector2[i]>=vector2[i-1]) {
		vector2[i]=vector2[i];
		System.out.print(vector2[i]+" ");}
	else do { 
		System.out.println("\nThe number you enter must be bigger than the last one");
		vector2[i]=scan.nextInt();
		System.out.print(vector2[i]+" ");}
	while ( vector2[i]<vector2[i-1]) ;
	}
for (int i=0;i<dim;i++) {
	System.out.println(vector2[i]);}       	

//-----

System.out.println("The dimension of the Vector Result is:");
p=dim*2;
System.out.println(p);

System.out.println("Vector result is: ");
int[] vectorresult=new int[p];
for (int k=0;k<dim;k++) {
	 vectorresult[k]=vector1[k];}
for (int k=dim;k<p;k++) {
	 vectorresult[k]=vector2[k-dim];}

for (int j=0;j<p;j++) {
	for (int i=0;i<p-1;i++) {
		if (vectorresult[i]>vectorresult[i+1]) {
			int temp=vectorresult[i];
			vectorresult[i]=vectorresult[i+1];
			vectorresult[i+1]=temp;
		}
	}
}
for (int k=0;k<p;k++) {
System.out.println(vectorresult[k]);

}


}

// ------

public static int DimensionArray() {    // Input: Dimensiunea Array
	dim=scan.nextInt();
	System.out.println(dim);
	return dim;
	}


}