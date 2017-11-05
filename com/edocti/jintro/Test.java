public class Test {   // numele claselor de obicei este un sostantiv singular

private static double average (double[] x) {    // numele metodelor de obicei sunt verbe
if (x==null || x.length==0) {
	return 0;
}
double sum=0;
for (int i=0;i<x.length;i++) {
sum+=x[i];
}
return sum/x.length;
}

public static void main(String[] args) {
double arr[]={2.1,1.3,7,8,10,12.6};
System.out.println(average(arr));

}

}