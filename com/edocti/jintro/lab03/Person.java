
package com.edocti.jintro.lab03;

public class Person {
   private String name;
   private String surname;
   private int age;
   public static int MAX_AGE=200;
   
   // constructor
   public Person (String name, String surname, int age) {
   this.name=name;   // "this" se pune pentru ca parametrele constructorului au aceasi nume cu parametrele clasei
   this.surname=surname;
   this.age=age;
   }
   
   public void increaseAge(){
   age++;
   }
   
   public void eat() {
   System.out.println(name + " is eating");
   }
   
   public static void cucu(){   // metoda STATICA - nu este legata de nici un obiect. nu poate lucra cu un obiect
	   System.out.println("cucu!");
	   System.out.println("Max Age ="+ MAX_AGE);
   }
   
   public static int getMaxAge(){
	   return MAX_AGE;
   }
   
     
   public static void main (String[] args) {
	   Person ion=new Person("Ion","Ionescu",30);  // am creat un obiect si am creat o istanta "ion", 
	   Person george=new Person("George","Georgescu",25);
	   Person mihai=new Person("Mihai","Viteazul",50);
   
       System.out.println(ion);
   
       ion.increaseAge();
       ion.increaseAge();
       ion.eat();
	   
	   Person.cucu();
   }
   
   }
   