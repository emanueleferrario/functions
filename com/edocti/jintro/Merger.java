class Merger {
	public static int[] merge(int[] a1, int[] a2) {
		if (a1 == null || a1.length == 0)
			return a2;
		if (a2 == null || a2.length == 0)
			return a1;

		assert isSorted(a1);
		assert isSorted(a2);

		int[] a = new int[a1.length + a2.length];
		int i = 0, i1 = 0, i2 = 0;
		for (; i < a.length; i++) {
			if (i1 == a1.length) {
				a[i] = a2[i2++];
			} else if (i2 == a2.length) {
				a[i] = a1[i1++];
			} else if (a1[i1] <= a2[i2]) {
				a[i] = a1[i1++];
			} else {
				a[i] = a2[i2++];
			}
		}
		assert isSorted(a);
		return a;
	}

	private static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1])
				return false;
		}
		return true;
	}
	
	private static void printArr(int[] a) {
		for (int e : a) {
			System.out.printf("%d ", e);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a1 = {1, 2, 1, 6, 10, 20};
		int[] a2 = {2, 4, 5, 13, 15, 20, 30, 34};
		int[] a = merge(a1, a2);
		printArr(a1);
		printArr(a2);
		printArr(a);
	}
}
