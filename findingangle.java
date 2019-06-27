// findin an angle by using method multi argument type
class testing {
	void print(int a, int b) {
		int c = 180 - (a + b);
		System.out.println(c);

	}
}

public class methodtoprint {

	public static void main(String[] args) {
		testing t1 = new testing();
		t1.print(40, 90);

	}

}
