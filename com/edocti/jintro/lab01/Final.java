public class Final {
public static void main(String[] args) {
final int a=10;
System.out.println(a+1);
System.out.println(a);

final int b;
if(args.length>1) {
b=10;
} else {
b=20;
}

final int c;
switch(args.length) {
	case 1:c=10; break;
	case 2:c=20;break;
	case 3:c=30;break;
	case 4:c=40;break;
	default:c=100;
}
System.out.println(b);
System.out.println(c);
}
}
