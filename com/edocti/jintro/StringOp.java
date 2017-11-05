class StringOp {

	public static String findShortest(String[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		int min = Integer.MAX_VALUE;
		System.out.println(min);
		String smallest = null;
		for (String e : a) {
			if (e.length() < min) {
				min = e.length();
				smallest = e;
			}
		}
		return smallest;
	}

	
	public static void shuffle(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int rnd = (int)((a.length - i) * Math.random());
			int newIndex = i + rnd;
			//swap
			int tmp = a[newIndex];
			a[newIndex] = a[i];
			a[i] = tmp;
		}
	}
	
	private static void printArr(int[] a) {
		for (int e : a) {
			System.out.printf("%d ", e);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println(findShortest(args));
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		shuffle(a);
		printArr(a);
	}
}
