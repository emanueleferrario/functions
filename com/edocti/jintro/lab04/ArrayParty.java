package com.edocti.jintro.lab04;

public class ArrayParty {
	
	public static void main(String[] args) {
		checkArgs(args);
		int l=parseAsInt(args[0]);
		int c=parseAsInt(args[1]);
		int [][]a=generateArr(l,c);
		
		for (int[] e:a) {
			printArr(e);
		}
	}
	
	private static void checkArgs (String[]args) {
		if (args.length<2) {
			System.err.println("Too few arguments. Please provide number of columns");
			System.exit(-1);
		    }
		}
	
	
	
	private static int parseAsInt (String input) {   //parseAs Int transforma string cititide la tastatura in un intreg
		int n=-1;
		if (input==null || input.trim().length()==0)  {
			System.err.println("Not a number");
		    System.exit(-1);
	        }
		try {
		n= Integer.parseInt (input);
	} catch (NumberFormatException e) {
	        System.err.println("Not a number");
		    System.exit(-1);
	        }
      return n;
			}

	private static void printArr(int[] a) {
		for (int i:a) {
			System.out.printf("%5d ",i);
	}
	System.out.println();
	}

	private static int[][] generateArr(int l, int c) {
		int [][] a=new int [l][];    // {null,null, ......., null}
	    for (int i=0;i<l;i++) {
	    int cols=1+(int)(c*Math.random());
	    a[i]=new int [cols];     // {0,0 .....,0}
	    for (int j=0;j<cols;j++) {
		     a[i][j]=(int)(100*Math.random()); 
		}
	}
	return a;
	}
}