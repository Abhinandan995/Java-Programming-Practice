//Even Squares up to a given Number
import java.util.Scanner;
public class Forloop {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ending Value");
		int m = sc.nextInt();
		for(int i = 1;i<=m;i++)
		{
			if(i%2 == 0)
				{
					System.out.println("Square of "+i+" is "+i*i);
				}
		}
	}

}
