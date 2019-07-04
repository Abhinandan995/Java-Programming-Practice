//large characters in a word
public class lengthOfDay {
	public static void main(String args[]) {
		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String temp = "";
		for (String day : week) {
			if (day.length() > temp.length()) {
				temp = day;
			}
		}
		System.out.println(temp);
	}
}
