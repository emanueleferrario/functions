class Rotation {
	public static void rotateRight(int[] a, int pos) {
		if (a == null || a.length == 0)
			return;
		pos = pos % a.length;
		
		//1 3 4 5 6 7 9 4     -> 3 =>
		//4 1 3 4 5 6 7 9
		//9 4 1 3 4 5 6 7
		//7 9 4 1 3 4 5 6
		// =>
		//ultimele $pos pozitii ajung pe primele $pos pozitii
		
		int[] tmp = new int[pos];
		for (int i = 0; i < pos; i++)
			tmp[i] = a[a.length - pos + i];
		for (int i = a.length - 1; i >= pos; i--)
			a[i] = a[i-pos];
		for (int i = 0; i < pos; i++)
			a[i] = tmp[i];
	}


	private static void printArr(int[] a) {
		for (int e : a) {
			System.out.printf("%d ", e);
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int[] a = {1, 3, 4, 5, 6, 7, 9, 4};
		printArr(a);
		rotateRight(a, 3);
		printArr(a);
	}
}
