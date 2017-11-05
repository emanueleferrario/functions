
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Double.parseDouble;

public class SinCos {


public static void main(String[] args){
      if (args.length==0) {
		  err.println("Error: you must provide an angle");
          exit(-1);
	  }
	  double x=parseDouble(args[0]);
      x=toRadians(x);
	  double result =sin(x)*sin(x)+cos(x)*cos(x);
	  out.println(result);
	}
}
