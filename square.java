// Square upto a particular Number
import java.util.Scanner;
class square {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ending Value");
		int m = sc.nextInt();
		for(int i = 1;i<=m;i++)
		{
			System.out.println("Square of "+i+" is "+i*i);
		}
	}

}
