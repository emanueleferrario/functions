
package com.edocti.jintro;

import java.lang.Math;


public class Function_Exercises {



// 1. O functie care calculeaza suma elementelor unui array de numere intregi

public static long sumArray (int[] arr) {
	long sum=0;
	for (int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	return sum;
  
}
//----------------------------------------	

// 2. O functie care returneaza cel mai mic element dintr-un array de numere intregi	

public static int minimumValue (int[] arr) {
int min=arr[0];
for (int i=1;i<arr.length;i++) {
	min=Math.min(min,arr[i]);
}
return min;
}
//-----------------------------------------

//3. O functie care returneaza cel mai scurt element dintr-un array de String-uri	
	
// public static String shortestString (String [] arr) { }


//-----------------------------------------

//4. O functie care calculeaza valoarea medie dintr-un array de numere reale reprezentabile pe 64 de biti	

public static double mediumFloatValue (double [] arr) {
	double sum=0;
	for (int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	return (sum/arr.length);
  }	
//-----------------------------------------

// 5. O functie care calculeaza valoarea medie dintr-un array de numere reale reprezentabile pe 32 de biti

public static double mediumFloatValue (float [] arr) {
	float sum=0;
	for (int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	return (sum/arr.length);
  }
//----------------------------------------

// 6. O functie care aduna cu 10 fiecare element al unui array de numere reale pe 64 de biti

public static void addDoubleArray (double [] arr)  {
	for (int i=0;i<arr.length;i++) {
		arr[i]=arr[i]+10;
	}
  }
// --------------------------------------

// 7. O functie care aduna cu un numar intreg dat fiecare element al unui array de numere reale pe 32 de biti

public static void addFloatArray (float [] arr, int m)  {
	for (int i=0;i<arr.length;i++) {
		arr[i]=arr[i]+m;
	}
  }
//---------------------------------------

// 8. O functie care, pentru un array de numere intregi, returneaza un array in care fiecare element reprezinta 
//    dublul elementului corespunzator din array-ul de intrare

public static int [] doublingArray (int [] arr) {
	for (int i=0;i<arr.length;i++) {
		arr[i]=arr[i]*2;
	}
    return arr;
}
//---------------------------------------

// 9. O functie care afiseaza elementele unui array in ordine inversa

public static void inversingArray (double [] arr) {
	for (int i=0;i<arr.length;i++) {
		arr[i]=arr[arr.length-i];
	    System.out.print(arr[i]+" ");
	}
  }
//---------------------------------------

// 10. O functie care afiseaza elementele unui array in ordine naturala, dar din doi in doi

public static void jumpingArray (double [] arr) {
	double [] resultArray =new double [arr.length];
	resultArray[0]=arr[0];
	for (int i=1;i<arr.length;i++) {
		if (i%2==0) {
			resultArray[i]=arr[i];}
		System.out.print(resultArray[i]+" ");
	    }
	}
//---------------------------------------

// 11. O functie care sorteaza un array de numere intregi reprezentate pe 64 de biti

public static void sortingLongArray (long [] arr) {  }
//--------------------------------------

//12. O functie care sorteaza un array de numere intregi reprezentate pe 16 biti

public static void sortingShortArray (short [] arr) {  }
//--------------------------------------


}

