public class Hello {
	
	private static void arrayTests(String[] args){
		
		if(args==null || args.length==0);{
		return;
		}
		        System.out.print("Hello ");          // VARIANTA
		for (String name :args) {            // for (i=0;i<args.length-1;i++) {
		System.out.print(name+ ", ");        // System.out.print(args[i] + ", "); }
		}                                    // System.out.print(args[args.length-1]);
	}
	
	private static void arrayTests2(String[] args) {
		if(args==null || args.length==0);{
		return;
		}
		String greet ="Hello ";
		int n=args.length-1;
		for (int i=0;i<n;i++) {
		greet+=args[i]+", ";
		}
	    greet=greet+args[n]+", ";
		System.out.print(greet);
	}
	
	private static void arrayTests3() {
		String[] names={"Ion","Liviu","Paul","Alex"};
		for(int i=0;i<names.length;i++) {
		names[i]=names[i].toUpperCase();}
		for (String name: names)
				System.out.println(name);
		}
	public static void main (String[] args){
		 arrayTests2(args);	
         arrayTests3();		 
	}
}