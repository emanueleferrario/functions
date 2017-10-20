import java.lang.Math;

public class Exercise6 {

	// getName
	public static String getName(String student) {
		String[] lines = student.split("\n");
		if (lines == null || lines.length == 0) {
			return "You must insert the students !";
		}
		String names = student.split(",")[0].trim();
		return names;
	}

	// getSurname
	public static String getSurname(String student) {
		String[] lines = student.split("\n");
		if (lines == null || lines.length == 0) {
			return "You must insert the students !";
		}
		String surnames = student.split(",")[1].trim();
		return surnames;
	}

	// checkNotaLucrare1
	public static boolean checkNotaLucrare1(String student) {
		String notalucrare1 = (student.split(",")[2].trim());
		if (notalucrare1 != null) {
			return true;
		} else
			return false;
	}

	// checkNotaLucrare2
	public static boolean checkNotaLucrare2(String student) {
		String notalucrare2 = (student.split(",")[3].trim());
		if (notalucrare2 != null) {
			return true;
		} else
			return false;
	}

	// checkNotaTeza
	public static boolean checkNotaTeza(String student) {
		String notateza = (student.split(",")[4].trim());
		if (notateza != null) {
			return true;
		} else
			return false;
	}

	// getNotaLucrare1
	public static int getNotaLucrare1(String student) {
		String[] lines = student.split("\n");
		if (lines == null || lines.length == 0) {
			return -1;
		}
		int notalucrare1 = Integer.parseInt(student.split(",")[2].trim());
		return notalucrare1;
	}

	// getNotaLucrare2
	public static int getNotaLucrare2(String student) {
		String[] lines = student.split("\n");
		if (lines == null || lines.length == 0) {
			return -1;
		}
		int notalucrare2 = Integer.parseInt(student.split(",")[3].trim());
		return notalucrare2;
	}

	// getNotaTeza
	public static int getNotaTeza(String student) {
		String[] lines = student.split("\n");
		if (lines == null || lines.length == 0) {
			return -1;
		}
		int notateza = Integer.parseInt(student.split(",")[4].trim());
		return notateza;
	}

	// getNumarAbsente
	public static int getNumarAbsente(String student) {
		int numarabsente = Integer.parseInt(student.split(",")[5].trim());
		return numarabsente;
	}

	// getAverageNote
	public static int[] getAverageNote(String student) {
		String[] lines = student.split("\n");
		int[] averagenote = new int[lines.length];
		for (int i = 0; i <= lines.length - 1; i++) {
			if (checkNotaTeza(lines[i])) {
				if (checkNotaLucrare1(lines[i]) || checkNotaLucrare2(lines[i])) {
					if (getNumarAbsente(lines[i]) < 7) {
						averagenote[i] = Math.round(
								((getNotaTeza(lines[i]) + (getNotaLucrare1(lines[i]) + getNotaLucrare2(lines[i])) / 2)
										/ 2));
					} else {
						averagenote[i] = Math.round(
								((getNotaTeza(lines[i]) + (getNotaLucrare1(lines[i]) + getNotaLucrare2(lines[i])) / 2)
										/ 2) - 1);
					}
				} else {
					averagenote[i] = 3;
				}
			} else {
				averagenote[i] = 4;
			}
		}
		return averagenote;
	}

	// displaygetAverageNote
	public static void displayAverageNote(String student) {
		String[] lines = student.split("\n");
		for (int i = 0; i <= lines.length - 1; i++) {
			System.out.println(getName(lines[i]) + " " + getSurname(lines[i]) + ": " + getAverageNote(student)[i]);
		}
	}

	// CERINTA 2 -------------------------------------

	// displayGeneralAverageNote
	public static void displayGeneralAverageNote(String student) {
		String[] lines = student.split("\n");
		double sum = 0;
		for (int i = 0; i <= lines.length - 1; i++) {
			sum = sum + getAverageNote(student)[i];
		}
		System.out.println((sum / lines.length));
	}

	// CERINTA 3 --------------------------------------

	// getWorstAverage
	private static int getWorstAverage(String student) {
		String[] lines = student.split("\n");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= lines.length - 1; i++) {
			if (min > getAverageNote(student)[i]) {
				min = getAverageNote(student)[i];
			}
		}
		return min;
	}

	// displayWorstStudent
	private static void displayWorstStudent(String student) {
		String[] lines = student.split("\n");
		String worst = getName(lines[0]) + " " + getSurname(lines[0]);

		for (int i = 0; i < lines.length - 1; i++) {
			if (getAverageNote(student)[i] > getAverageNote(student)[i + 1]) {
				worst = getName(lines[i + 1]) + " " + getSurname(lines[i + 1]);
			}
		}
		System.out.print(worst + ", ");
	}

	// getBestAverage
	private static int getBestAverage(String student) {
		String[] lines = student.split("\n");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= lines.length - 1; i++) {
			if (max < getAverageNote(student)[i]) {
				max = getAverageNote(student)[i];
			}
		}
		return max;
	}

	// displayBestStudent
	private static void displayBestStudent(String student) {
		String[] lines = student.split("\n");
		String best = getName(lines[0]) + " " + getSurname(lines[0]);
		for (int i = 0; i < lines.length - 1; i++) {
			if (getAverageNote(student)[i] < getAverageNote(student)[i + 1]) {
				best = getName(lines[i + 1]) + " " + getSurname(lines[i + 1]);
			}
		}
		System.out.print(best + ", ");
	}

	// ------------------------------
	public static void main(String[] args) {

		String students = "Isaac, Newton,10,10, 10, 2\n" + "Albert, Einstein, 2, 2, 2, 5\n"
				+ "Enrico, Fermi, 2, 2 , 9, 4\n" + "Max, Planck, 3, 3, 4, 9\n" + "Michael, Faraday, 8, 8, 7, 1\n";

		System.out.println("Here are the students: ");
		System.out.println(students);

		System.out.println("Average Note for every students: ");
		displayAverageNote(students);
		System.out.println();

		System.out.print("General Average Note of the class is: ");
		displayGeneralAverageNote(students);
		System.out.println();

		System.out.print("WorstStudent: ");
		displayWorstStudent(students);
		System.out.print(getWorstAverage(students) + " \n");

		System.out.print("BestStudent: ");
		displayBestStudent(students);
		System.out.print(getBestAverage(students));

	}
}
