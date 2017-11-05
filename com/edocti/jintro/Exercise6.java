import java.lang.Math;

public class Exercise6 {

	// checkTableCompleteness
	public static boolean checkTableCompleteness(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		String[] elements = studentgroup.split(",");
		if (elements.length == 6 * lines.length) {
			return true;
		} else {
			return false;
		}
	}

	// getName
	public static String getName(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		if (lines == null || lines.length == 0) {
			return null;
		}
		String names = studentgroup.split(",")[0].trim();
		return names;
	}

	// getSurname
	public static String getSurname(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		if (lines == null || lines.length == 0) {
			return null;
		}
		String surnames = studentgroup.split(",")[1].trim();
		return surnames;
	}

	// checkNoteWork1
	public static boolean checkNoteWork1(String studentgroup) {
		String notework1 = (studentgroup.split(",", -1)[2].trim());
		if (!notework1.equals("")) {
			return true;
		} else
			return false;
	}

	// checkNoteWork2
	public static boolean checkNoteWork2(String studentgroup) {
		String notework2 = (studentgroup.split(",", -1)[3].trim());
		if (!notework2.equals("")) {
			return true;
		} else
			return false;
	}

	// checkNoteResearch
	public static boolean checkNoteResearch(String studentgroup) {
		String noteresearch = (studentgroup.split(",", -1)[4].trim());
		if (!noteresearch.equals("")) {
			return true;
		} else
			return false;
	}

	// getNoteWork1
	public static int getNoteWork1(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		int notework1;
		if (lines == null || lines.length == 0) {
			return -1;
		}
		String token = studentgroup.split(",", -1)[2].trim();
		if (token.equals("")) {
			notework1 = -1;
		} else {
			notework1 = Integer.parseInt(token);
		}
		return notework1;
	}

	// getNotework2
	public static int getNoteWork2(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		int notework2;
		if (lines == null || lines.length == 0) {
			return -1;
		}
		String token = studentgroup.split(",", -1)[3].trim();
		if (token.equals("")) {
			notework2 = -1;
		} else {
			notework2 = Integer.parseInt(token);
		}
		return notework2;
	}

	// getNoteResearch
	public static int getNoteResearch(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		int noteresearch;
		if (lines == null || lines.length == 0) {
			return -1;
		}
		String token = studentgroup.split(",", -1)[4].trim();
		if (token.equals("")) {
			noteresearch = -1;
		} else {
			noteresearch = Integer.parseInt(token);
		}
		return noteresearch;
	}

	// getNumberMissings
	public static int getNumberMissings(String studentgroup) {
		int numbermissings = Integer.parseInt(studentgroup.split(",")[5].trim());
		return numbermissings;
	}

	// getAverageNote
	public static int[] getAverageNote(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		int[] averagenote = new int[lines.length];
		for (int i = 0; i <= lines.length - 1; i++) {
			if (checkNoteResearch(lines[i]) == false) {
				averagenote[i] = 4;
			} else {
				if (getNumberMissings(lines[i]) < 7) {

					if (checkNoteWork1(lines[i]) == false && checkNoteWork2(lines[i]) == true) {
						averagenote[i] = Math
								.round(((getNoteResearch(lines[i]) + (3 + getNoteWork2(lines[i])) / 2) / 2));
						if (averagenote[i] < 0) {
							averagenote[i] = 0;
						}
					}
					if (checkNoteWork1(lines[i]) == true && checkNoteWork2(lines[i]) == false) {
						averagenote[i] = Math
								.round(((getNoteResearch(lines[i]) + (getNoteWork1(lines[i]) + 3) / 2) / 2));
						if (averagenote[i] < 0) {
							averagenote[i] = 0;
						}
					}
					if (checkNoteWork1(lines[i]) == false && checkNoteWork2(lines[i]) == false) {
						averagenote[i] = Math.round(((getNoteResearch(lines[i]) + (3 + 3) / 2) / 2));
						if (averagenote[i] < 0) {
							averagenote[i] = 0;
						}

					} else {
						averagenote[i] = Math.round(
								((getNoteResearch(lines[i]) + (getNoteWork1(lines[i]) + getNoteWork2(lines[i])) / 2)
										/ 2));
						if (averagenote[i] < 0) {
							averagenote[i] = 0;
						}
					}
				} else {
					averagenote[i] = Math.round(
							((getNoteResearch(lines[i]) + (getNoteWork1(lines[i]) + getNoteWork2(lines[i])) / 2) / 2)
									- 1);
					if (averagenote[i] < 0) {
						averagenote[i] = 0;
					}

				}
			}
		}
		return averagenote;
	}

	// displaygetAverageNote
	public static void displayAverageNote(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		for (int i = 0; i <= lines.length - 1; i++) {
			System.out.println(getName(lines[i]) + " " + getSurname(lines[i]) + ": " + getAverageNote(studentgroup)[i]);
		}
	}

	// CERINTA 2 -------------------------------------

	// displayGeneralAverageNote
	public static void displayGeneralAverageNote(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		double sum = 0;
		for (int i = 0; i <= lines.length - 1; i++) {
			sum = sum + getAverageNote(studentgroup)[i];
		}
		System.out.println((sum / lines.length));
	}

	// CERINTA 3 --------------------------------------

	// getWorstAverage
	private static int getWorstAverage(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= lines.length - 1; i++) {
			if (min > getAverageNote(studentgroup)[i]) {
				min = getAverageNote(studentgroup)[i];
			}
		}
		return min;
	}

	// displayWorstStudent
	private static void displayWorstStudent(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		String worst = getName(lines[0]) + " " + getSurname(lines[0]);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= lines.length - 1; i++) {
			if (min > getAverageNote(studentgroup)[i]) {
				min = getAverageNote(studentgroup)[i];
				worst = getName(lines[i]) + " " + getSurname(lines[i]);
			}
		}
		System.out.print(worst + ", ");
	}

	// getBestAverage
	private static int getBestAverage(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= lines.length - 1; i++) {
			if (max < getAverageNote(studentgroup)[i]) {
				max = getAverageNote(studentgroup)[i];
			}
		}
		return max;
	}

	// displayBestStudent
	private static void displayBestStudent(String studentgroup) {
		String[] lines = studentgroup.split("\n");
		String best = getName(lines[0]) + " " + getSurname(lines[0]);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= lines.length - 1; i++) {
			if (max < getAverageNote(studentgroup)[i]) {
				max = getAverageNote(studentgroup)[i];
				best = getName(lines[i]) + " " + getSurname(lines[i]);
			}
		}
		System.out.print(best + ", ");
	}

	// ------------------------------
	public static void main(String[] args) {

		String students = "Isaac, Newton,6, 10, 9, 2,\n" + "Albert, Einstein, , 8, 7, 5,\n"
				+ "Enrico, Fermi, 8, 8 , 9, 4,\n" + "Max, Planck,3 , 3, , 9,\n" + "Michael, Faraday, 7, 4, 5, 1\n";

		System.out.println("Here are the students: ");
		System.out.println(students);

		checkTableCompleteness(students);
		if (checkTableCompleteness(students) == false) {
			System.out.println("Provide the Table in the correct format");

		} else {
			System.out.println("Average Note for every students: ");
			displayAverageNote(students);
			System.out.println();

			System.out.print("General Average Note of the class is: ");
			displayGeneralAverageNote(students);
			System.out.println();

			System.out.print("Worst Student: ");
			displayWorstStudent(students);
			System.out.print("average note: " + getWorstAverage(students) + " \n");

			System.out.print("Best Student: ");
			displayBestStudent(students);
			System.out.print("average note: " + getBestAverage(students));

		}
	}
}
