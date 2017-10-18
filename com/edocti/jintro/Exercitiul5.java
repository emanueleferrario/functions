import java.util.Scanner;

public class Exercitiul5 {

public static Scanner scan=new Scanner(System.in);



private static boolean stringisEmpty(String input) {
	return input==null || input.trim().length()==0;
}

//getAge
private static int getAge(String line) {
	if (stringisEmpty(line)) {
		return -1; // string este gol
	}
    try {
    	return Integer.parseInt(line.split(",")[2].trim());
    } 
    catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
    {
    		    		return -1; }
}

//getName
private static String getName(String line) {
	if (stringisEmpty(line)) {
		return "The String is empty"; // string este gol
	}
    try {
	return line.split(",")[1].trim();
    }
    catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
    {
    		    		return ""; }
}


//Display Names
private static void displayNames (String lines) {
	String[]line=lines.split("\n");
	for (int i=0;i<=line.length-1;i++) {
		System.out.println(getName(line[i]));
	}
}

//Minimum Age
private static void displayMinimumAge (String lines) {
	String [] line=lines.split ("\n");
	int min=getAge(line[0]);
	int temp;
		for (int i=0;i<line.length-1;i++) {
		
	    if (getAge(line[i])<getAge(line[i+1])) {
		    temp=getAge(line[i]);
		}
	    else { temp=getAge(line[i+1]);
	    }
	    if (min>temp) {
	    	  min=temp;
	    	  }
		}
	System.out.println(min);
}

//Maximum Age
private static void displayMaximumAge (String lines) {
	String [] line=lines.split ("\n");
	int max=getAge(line[0]);
	int temp;
		for (int i=0;i<line.length-1;i++) {
		
	    if (getAge(line[i])>getAge(line[i+1])) {
		    temp=getAge(line[i]);
		}
	    else { temp=getAge(line[i+1]);
	    }
	    if (max<temp) {
	    	  max=temp;
	    	  }
		}
	System.out.println(max);
}

//MediumAge
private static void displayMediumAge (String lines) {
	String [] line=lines.split ("\n");
	int sum=0;
	double medium;
		for (int i=0;i<=line.length-1;i++) {
		sum=sum+getAge(line[i]);
	    		}
	    medium=sum/line.length; 
		System.out.println(medium);
}

//Check Double Name
private static void displayDoubleName (String lines) {
	String [] line=lines.split ("\n");

		for (int i=0;i<line.length-1;i++) {
		     for (int j=0;j<line.length-1;j++) {
			 if (getName(line[j])==getName(line[j+1])) {
				 String doubleName=getName(line[j]);
		    		System.out.println(doubleName);
		    		}
		    }		    	
		}  
	}	
	

public static void main(String[] args) {

	String test="Ianas,Paul,34\n"+ "Gherghinescu,Paul,25\n" + "Ionescu, Dumitru, 50\n" + "Gherghinescu,Paul, 30\n" + "Costache, Negruzzi, 40\n";
	System.out.println(test);
	
	System.out.println("Minimum age is: ");
	displayMinimumAge(test);
	
	System.out.println("Maximum age is: ");
	displayMaximumAge(test);
	
	System.out.println("Medium age is: ");
	displayMediumAge(test);
	
	System.out.println("The Names are: ");
	displayNames(test);
	
	System.out.println("The Names that appears at least twice are: ");
	displayDoubleName(test);
    }

}


	