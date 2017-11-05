package com.edocti.jintro.lab02;

import java.util.Scanner;

public class FunctionBasics 
{


public static void main (String[] args) 
{
	Scanner scan;
	scan=new Scanner(System.in);
	
	if (args.length==0) {
	System.err.println("Provide array length");
		System.exit(-1);
	}
	
	int n=Integer.parseInt(args[0]);
	int[] a1=new int[n];
	int[] a2=new int[n];
	int[] res=new int[n];
		
	for (int i=0;i<n;i++) {
		a1[i]=scan.nextInt();
		}
		
	for (int i=0;i<n;i++) {
		a2[i]=scan.nextInt();
		}
		
	for (int i=0;i<n;i++) {
		System.out.println(a1[i]);
		}
		
	for (int i=0;i<n;i++) {
		System.out.println(a2[i]);
		}

	for (int i=0;i<n;i++) {
         res[i]=a1[i]+a2[i];
	}
	
	for (int i=0;i<n;i++) {
		System.out.println(res[i]);
		}
	
		
		}
		
}