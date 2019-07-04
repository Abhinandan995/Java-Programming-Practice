import java.util.Scanner;
class customer {
	void name(String name) {
		System.out.print("Hello " + name);
	}

	void details() {
		System.out.println("\"Items Available\"");
		System.out.println("1.Oil \t2.Flour \t3.Vegetables");
		System.out.println("Enter you Choice");
	}

	String deliveryaddress(String address) {
		System.out.println("Delivery Address " + address);
		return address;
	}

	String customer;

	public void selectproduct(int product) {
		switch (product) {
		case 1:
			System.out.println(" you ordered \"Oil\" ");
			break;
		case 2:
			System.out.println(" you ordered \"Flour\"");
			break;
		case 3:
			System.out.println(" you ordered \"Vegetables\"");
			break;
		}
	}

	public void login(int customer) {
		System.out.println("Customer status");
		if (customer == 1) {
			System.out.println("Customer is Entered");
		} else {
			System.out.println("Customer is Exit ");
		}
	}

}

public class Onlineshopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer Status whether IN or OUT");
		int customer = sc.nextInt();
		if (customer == 1) {
			customer c = new customer();
			c.login(customer);
			System.out.print("Enter your name ");
			String name = sc.next();
			System.out.println("Enter the Delivery address ");
			String address = sc.next();
			c.details();
			int product = sc.nextInt();
			c.name(name);
			c.selectproduct(product);
			c.deliveryaddress(address);
		} else {
			System.out.println("Thank You ");
		}

	}

}
