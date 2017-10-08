import java.util.Scanner;

import java.lang.Math;

public class Exercitiul4 {

public static Scanner scan=new Scanner(System.in);

private static int dim;   // dimensiune Array

public static void main (String[] args) {
	
	System.out.println("Insert dimension of the Array ");	
	DimensionArray();	

	System.out.println("Insert the Array");      // 
	int[] vector =new int[dim];
	for (int i=0;i<dim;i++) {
		vector[i]=scan.nextInt();}
	for (int i=0;i<dim;i++) {
		System.out.print(vector[i]+" ");}          //

    System.out.println("\nResult Array after shuffling: ");
    for (int i=0;i<dim;i++) {
    	int[] vectorresult=new int[dim];
    	int index=-1;
    	int r;
       	 	    do {r=(int)(dim*Math.random());} 
				while (r==index);
                vectorresult[i]=vector[r];
                System.out.print(vectorresult[i]+" ");
                index=r;
                
    }

}
//------

public static int DimensionArray() {    // Input: Dimensiunea Array-ului
	dim=scan.nextInt();
	System.out.println(dim);
	return dim;
	}



}