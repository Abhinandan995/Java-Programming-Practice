class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("line 1", "Hyderabad", "500035");
		Customer customer = new Customer("User", homeAddress);
		System.out.println(customer);
		Address workAddress = new Address("line 1 for work", "Hyderabad", "500078");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}
}

class Address {
	private String line1;
	private String city;
	private String zip;

	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	public String toString() {
		return line1 + " " + city + " " + zip;
	}
}

class Customer {
	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public String toString() {
		return String.format("name - [%s] homeaddress - [%s] work address - [%s])", name, homeAddress, workAddress);
	}
}
