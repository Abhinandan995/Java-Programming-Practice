import java.util.Scanner; // triangle based on if condition
class triangle{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int angle1 = sc.nextInt();
		int angle2 = sc.nextInt();
		int angle3 = sc.nextInt();
		if((angle1+angle2+angle3)==180)
		{
			System.out.println("These angles can able to make Triangle ");
			System.out.println("The sum of angles are "+(angle1+angle2+angle3));
		}
		else
		{
			System.out.println("These angles cannot able to make Triangle ");
			System.out.println("The sum of angles are "+(angle1+angle2+angle3));
		}
	}

}
