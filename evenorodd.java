import java.util.Scanner;  //find a a whether it is even or odd
class evenorodd {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if((number%2)==0)
		{
			System.out.println("The Entered Number is EVEN");
		}
		else
		{
			System.out.println("The Entered number is ODD ");
		}
	}

}
