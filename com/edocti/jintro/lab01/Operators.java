import static java.lang.System.*;
//import static java.lang.String.*;
//import static java.lang.Integer.*;

public class Operators {

private static String toBynary(int n){
	return String.format("%32s",Integer.toBinaryString(n)).replace(' ', '0');
}
	
	public static void main (String[] args) {
	int i=10;
	out.println(i++);  //i=i+1
	out.println(i);
	out.println(++i);
	
	i=10;
	out.println(toBynary(i));
	out.println(toBynary(i << 1));
	out.println (i << 1);
	out.println(i << 2);
	
	out.println(toBynary(10));
}
}
