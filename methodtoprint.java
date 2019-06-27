//printing the number with the help of method return type
class testing {
	void print(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);

		}
	}
}

public class methodtoprint {

	public static void main(String[] args) {
		testing t1 = new testing();
		t1.print(20);

	}

}
