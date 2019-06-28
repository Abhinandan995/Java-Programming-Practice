// cheking the books
import java.util.Scanner;

class Bookrun {
	int need;
	char require;

	void numberOfCopies(char require) {
		this.require = require;
		if (require == 'Y') {
			System.out.println("Printing will START");
		} else
			System.out.println("Thanks For Your Response.. ");
	}

	void Booksneed(int need) {
		this.need = need;
		if (need >= 0)
			System.out.println("Thanks for Respones");
		else
			System.out.println("ENTERED a wrong value");
	}

	void available(int need) {
		this.need = need;
		int total_books = 250;
		if (total_books > need)
			System.out.println("\"BOOKS AVAILABLE\"");
		else
			System.out.println("\"BOOKS ARE NOT AVAILABLE\"\n\"Available books are \"" + total_books + "\"");
	}
}

class book {
	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.print("Enter the number of Books you need: ");
		int need = sc.nextInt();
		Bookrun b1 = new Bookrun();
		b1.Booksneed(need);
		System.out.print("Verifying the Books:  ");
		b1.available(need);
		System.out.println("Do you Need Copies");
		System.out.println("***IF YOU NEED COPIES ENTER \"Y\" ORELSE \"N\"***");
		char require = sc.next().charAt(0);
		b1.numberOfCopies(require);
	}
}
