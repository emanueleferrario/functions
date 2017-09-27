
package com.edocti.jintro.lab03;

class A {	//extends java.lang.Object() 
protected int a;
protected int b;

// public A() {super()}
public A(int a,int b) {   // am declarat un constructor
this.a=a;
this.b=b;

System.out.println("Constructor A(a,b) called");   
}
public void foo() {   // metodele PROTECTED se mostenesc, metodele PRIVATE nu!!!
	System.out.println("A.foo(), " + a +" , "+ b);
}
}
// atributi si metode PRIVATE nu poate fi mostenite
class B extends A {
	protected int c;
	
	public void bar() {
		System.out.println("B.bar(), " + a + " ,"+ b +" , " + c);	}

public B() {
	// super ();  // totimpul prima linee intr un constructol este super()
	super(1,2);
	c=10;
	}

	@Override public void foo() {System.out.println("B.foo(), "+ a + " ,"+ b +" , " + c);}
	
}
	
public class InheritanceParty {
 public static void main(String[] args) {
	A b=new B();
	b.a=70;
	b.b=80;
	
	b.foo();
	B b2=(B)b;   // CASTING: se transforma tipul din unu in altul, adica se tranforma b2 din tipul declarat A in tipul declarat B
	
	b2.bar();
}

}
