//priting the week days in reverse order

public class Arraye {
	public static void main(String args[]) {
		// String week[] = new String[];
		int i;
		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (i = week.length - 1; i > 0; i--) {
			System.out.println(week[i]);
		}
	}
}
